package com.ccying.weChatIt.utils;

import cn.zhouyafeng.itchat4j.api.WechatTools;
import cn.zhouyafeng.itchat4j.core.Core;
import cn.zhouyafeng.itchat4j.service.ILoginService;
import cn.zhouyafeng.itchat4j.service.impl.LoginServiceImpl;
import cn.zhouyafeng.itchat4j.utils.SleepUtils;
import cn.zhouyafeng.itchat4j.utils.tools.CommonTools;
import com.google.common.base.Strings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 登陆控制器
 * <p>
 * Created by creatchen on 2017/6/9.
 */
@Slf4j
@Component
public class LoginController {
    private static Core core = Core.getInstance();
    private ILoginService loginService = new LoginServiceImpl();


    public void login(Long uid, String qrPath) {
        if (core.isAlive()) { // 已登陆
            log.info("itchat4j已登陆");
            return;
        }
        while (true) {
            for (int count = 0; count < 10; count++) {
                log.info("获取UUID");
                while (loginService.getUuid() == null) {
                    log.info("1. 获取微信UUID");
                    while (loginService.getUuid() == null) {
                        log.warn("1.1. 获取微信UUID失败，两秒后重新获取");
                        SleepUtils.sleep(2000);
                    }
                }
                log.info("2. 获取登陆二维码图片");
                String newQrPath = loginService.getQRPath(qrPath);
                if (!Strings.isNullOrEmpty(newQrPath)) {
                    //TODO 发送图片地址
                    String path = newQrPath.substring(newQrPath.indexOf("image"));

                } else if (count == 10) {
                    log.error("2.2. 获取登陆二维码图片失败，系统退出");
                    System.exit(0);
                }
            }
            log.info("3. 请扫描二维码图片，并在手机上确认");
            if (!core.isAlive()) {
                loginService.login();
                core.setAlive(true);
                log.info(("登陆成功"));
                break;
            }
            log.info("4. 登陆超时，请重新扫描二维码图片");
        }

        log.info("5. 登陆成功，微信初始化");
        if (!loginService.webWxInit()) {
            log.info("6. 微信初始化异常");
            System.exit(0);
        }

        log.info("6. 开启微信状态通知");
        loginService.wxStatusNotify();

        log.info("6. 清除。。。。");
        CommonTools.clearScreen();
        log.info(String.format("欢迎回来， %s", core.getNickName()));

        log.info("7. 开始接收消息");
        loginService.startReceiving();

        log.info("8. 获取联系人信息");
        loginService.webWxGetContact();

        log.info("9. 缓存本次登陆好友相关消息");
        WechatTools.setUserInfo(); // 登陆成功后缓存本次登陆好友相关消息（NickName, UserName）
    }
}
