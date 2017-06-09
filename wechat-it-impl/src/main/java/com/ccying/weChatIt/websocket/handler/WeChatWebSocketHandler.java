package com.ccying.weChatIt.websocket.handler;

import com.ccying.weChatIt.websocket.WebSocketConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

/**
 * websocket的处理
 * Created by creatchen on 2017/6/9.
 */
@Slf4j
@Component
public class WeChatWebSocketHandler implements WebSocketHandler {


    @Override
    public void afterConnectionEstablished(WebSocketSession webSocketSession) throws Exception {
        Long uid = (Long) webSocketSession.getAttributes().get("uid");
        if (WebSocketConfig.getWebSocketSession(uid) == null) {
            WebSocketConfig.setWebSocketSession(uid, webSocketSession);
        }
    }

    @Override
    public void handleMessage(WebSocketSession webSocketSession, WebSocketMessage<?> webSocketMessage) throws Exception {
    }

    /**
     * 连接出错
     *
     * @param webSocketSession
     * @param throwable
     * @throws Exception
     */
    @Override
    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession webSocketSession, CloseStatus closeStatus) throws Exception {
        Long uid = (Long) webSocketSession.getAttributes().get("uid");
        WebSocketConfig.removeWebSocketSession(uid);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }


}
