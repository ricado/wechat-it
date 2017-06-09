package com.ccying.weChatIt.websocket.handler;

import com.ccying.weChatIt.websocket.WebSocketConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;

/**
 * websocket 发送消息处理
 * Created by creatchen on 2017/6/9.
 */
@Component
@Slf4j
public class SendWebSocketHandler {

    /**
     * 发送文本消息到客户端
     *
     * @param uid
     * @param message
     */
    public boolean sendMessageToUser(Long uid, String message) {
        log.info("发送文本信息 >>> uid = {} , messgae = {}", uid, message);
        TextMessage textMessage = new TextMessage(message);
        try {
            return sendMessageToUser(uid, textMessage);
        } catch (IOException e) {
            String error = e.getMessage();
            log.info("发送文本信息失败 >>> uid = {} , message = {} ,eMessage = {} ", uid, message, error);
        }
        return false;
    }

    /**
     * 发送消息到用户
     *
     * @param uid
     * @param message
     * @throws IOException
     */
    public boolean sendMessageToUser(Long uid, WebSocketMessage message) throws IOException {
        WebSocketSession session = WebSocketConfig.getWebSocketSession(uid);
        if (session == null) {
            // TODO
            return false;
        } else {
            session.sendMessage(message);
            log.info("发送文本消息成功 >>> uid = {}", uid);
        }
        return true;
    }

}
