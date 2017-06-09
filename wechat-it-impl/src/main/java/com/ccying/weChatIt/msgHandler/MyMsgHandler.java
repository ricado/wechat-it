package com.ccying.weChatIt.msgHandler;

import cn.zhouyafeng.itchat4j.face.IMsgHandlerFace;
import com.alibaba.fastjson.JSONObject;
import com.ccying.weChatIt.contansts.Message;
import com.ccying.weChatIt.utils.WeChatJsonUtil;

/**
 *
 * Created by creatchen on 2017/6/7.
 */
public class MyMsgHandler implements IMsgHandlerFace {



    @Override
    public String textMsgHandle(JSONObject msg) {
        Message message = WeChatJsonUtil.jsonToMessage(msg);

        return null;
    }

    @Override
    public String picMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public String voiceMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public String viedoMsgHandle(JSONObject msg) {
        return null;
    }

    @Override
    public String nameCardMsgHandle(JSONObject msg) {
        return null;
    }

}
