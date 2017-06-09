package com.ccying.weChatIt.utils;

import com.alibaba.fastjson.JSONObject;
import com.ccying.weChatIt.contansts.AppInfo;
import com.ccying.weChatIt.contansts.Message;
import com.ccying.weChatIt.contansts.MessageJsonKeys;
import com.ccying.weChatIt.contansts.RecommendInfo;
import lombok.extern.slf4j.Slf4j;

/**
 * wechat相关的json操作
 * Created by creatchen on 2017/6/7.
 */
@Slf4j
public class WeChatJsonUtil {
    /**
     * 将json字符串转化成Message对象
     *
     * @param json json字符串
     * @return Message对象
     */
    public static Message jsonToMessage(String json) {
        return jsonToMessage(JSONObject.parseObject(json));
    }

    /**
     * 将JSONObject对象转化成Message对象
     *
     * @param jsonObject JSONObject对象
     * @return Message对象
     */
    public static Message jsonToMessage(JSONObject jsonObject) {
        // System.out.println(jsonObject.toString());
        RecommendInfo recommendInfo = new RecommendInfo();
        AppInfo appInfo = new AppInfo();
        if (jsonObject.getJSONObject(MessageJsonKeys.RecommendInfo) != null) {
            recommendInfo = jsonObject.getJSONObject(MessageJsonKeys.RecommendInfo).toJavaObject(RecommendInfo.class);
        }
        if (jsonObject.getJSONObject(MessageJsonKeys.AppInfo) != null) {
            appInfo = jsonObject.getJSONObject(MessageJsonKeys.AppInfo).toJavaObject(AppInfo.class);
        }
        Message message = jsonObject.toJavaObject(Message.class);
        message.setRecommendInfo(recommendInfo);
        message.setAppInfo(appInfo);
//        System.out.println(message);
        return message;
    }

}
