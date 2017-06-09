package com.ccying.weChatIt.listener;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 设置路径
 * Created by creatchen on 2017/6/8.
 */
@Slf4j
public class InitListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String path = sce.getServletContext().getRealPath("/");
        log.info("project path:" + path);
        System.getProperties().put("projectPath", path);
        String logInfoPath = path + "log/info";
        String logErrorPath = path + "log/error";
        String logDebugPath = path + "log/debug";
        System.setProperty("logInfoPath", logInfoPath);
        System.setProperty("logErrorPath", logErrorPath);
        System.setProperty("logDebugPath", logDebugPath);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
