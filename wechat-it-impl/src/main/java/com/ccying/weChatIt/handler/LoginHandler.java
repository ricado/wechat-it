package com.ccying.weChatIt.handler;


import com.ccying.weChatIt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by creatchen on 2017/6/8.
 */
@Controller
public class LoginHandler {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String hello(HttpServletRequest request) {
        request.getSession().setAttribute("uid", System.currentTimeMillis());
        // 加一个redis层 保存用户当前的uid
        loginService.login();
        return "login.html";
    }
}
