package com.ccying.weChatIt.websocket.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by creatchen on 2017/6/9.
 */
@Component
public class LoginMessageSender {

    @Autowired
    private SendWebSocketHandler sendWebSocketHandler;

    public void sendQrPath(Long uid, String qrPath) {
        sendWebSocketHandler.sendMessageToUser(uid, qrPath);
    }
}
