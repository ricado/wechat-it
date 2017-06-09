package com.ccying.weChatIt.utils;


import cn.zhouyafeng.itchat4j.core.Core;
import cn.zhouyafeng.itchat4j.core.MsgCenter;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * weChat启动
 * Created by creatchen on 2017/6/9.
 */
@Slf4j
@Component
public class WeChat {
    private IMsgHandlerFace msgHandler;
    private Core core = Core.getInstance();

    @Autowired
    private LoginController loginController;

    public WeChat(IMsgHandlerFace msgHandler, Long uid, String qrPath) {
        System.setProperty("jsse.enableSNIExtension", "false"); // 防止SSL错误
        this.msgHandler = msgHandler;
        // 登陆
        loginController.login(uid, qrPath);
    }

    public void start() {
        log.info("+++++++++++++++++++开始消息处理+++++++++++++++++++++");
        new Thread(new Runnable() {
            @Override
            public void run() {
                MsgCenter.handleMsg(msgHandler);
            }
        }).start();
    }
}
