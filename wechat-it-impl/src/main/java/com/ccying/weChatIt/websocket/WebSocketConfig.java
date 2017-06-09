package com.ccying.weChatIt.websocket;

import com.ccying.weChatIt.websocket.handler.WeChatWebSocketHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by creatchen on 2017/6/9.
 */
@Component
@EnableWebSocket
public class WebSocketConfig extends WebMvcConfigurerAdapter implements WebSocketConfigurer {

    private static final Map<Long, WebSocketSession> MAP = new HashMap<>();

    @Resource
    WeChatWebSocketHandler handler;

    public static void setWebSocketSession(Long uid, WebSocketSession session) {
        if (getWebSocketSession(uid) != null) {
            MAP.put(uid, session);
        }
    }

    public static WebSocketSession getWebSocketSession(Long uid) {
        return MAP.get(uid);
    }

    /**
     * 移除WebSocketSeeion
     *
     * @param uid
     * @return
     */
    public static boolean removeWebSocketSession(Long uid) {
        MAP.remove(uid);
        return true;
    }

    /**
     * 移除WebSocketSession
     *
     * @param session
     * @return
     */
    public static Long removeWebSocketSession(WebSocketSession session) {
        for (Long uid : MAP.keySet()) {
            WebSocketSession session1 = getWebSocketSession(uid);
            if (session1 == session) {
                removeWebSocketSession(uid);
                return uid;
            }
        }
        return 0L;
    }

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        HandshakeInterceptor handshakeInterceptor = new WebSocketHandshakeInterceptor();
        registry.addHandler(handler, "/ws").addInterceptors(handshakeInterceptor);
        registry.addHandler(handler, "/ws/sockjs").addInterceptors(handshakeInterceptor).withSockJS();
    }
}
