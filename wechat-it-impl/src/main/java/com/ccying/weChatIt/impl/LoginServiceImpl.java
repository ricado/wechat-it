package com.ccying.weChatIt.impl;

import cn.zhouyafeng.itchat4j.Wechat;
import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.ccying.weChatIt.msgHandler.MyMsgHandler;
import com.ccying.weChatIt.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 登陆处理
 * Created by creatchen on 2017/6/8.
 */
@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    public static void main(String[] args) {
//        String path = getClass().getClassLoader().getResource("/").getPath();
//        System.out.println(path);
    }

    @Override
    public void login() {
        String path = System.getProperty("projectPath");
        log.info("project path:" + path);
        String qrPath = path + "image"; // 保存登陆二维码图片的路径
        IMsgHandlerFace msgHandler = new MyMsgHandler(); // 实现IMsgHandlerFace接口的类
        Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
        wechat.start(); // 启动服务，会在qrPath下生成一张二维码图片，扫描即可登陆，注意，二维码图片如果超过一定时间未扫描会过期，过期时会自动更新，所以你可能需要重新打开图片
    }
}
