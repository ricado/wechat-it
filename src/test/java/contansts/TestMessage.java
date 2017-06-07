package contansts;

import com.ccying.weChatIt.utils.WeChatJsonUtil;
import org.junit.Test;

/**
 * Created by creatchen on 2017/6/7.
 */

public class TestMessage {

    String textMassage = "{\n" +
            "    \"SubMsgType\": 0,\n" +
            "    \"VoiceLength\": 0,\n" +
            "    \"FileName\": \"\",\n" +
            "    \"ImgHeight\": 0,\n" +
            "    \"ToUserName\": \"@58b8651e056f8937f7a4eaa386be0c16d2583a0fdb5741b874cedffe3e13e723\",\n" +
            "    \"HasProductId\": 0,\n" +
            "    \"ImgStatus\": 1,\n" +
            "    \"Url\": \"\",\n" +
            "    \"ImgWidth\": 0,\n" +
            "    \"ForwardFlag\": 0,\n" +
            "    \"Status\": 3,\n" +
            "    \"Ticket\": \"\",\n" +
            "    \"RecommendInfo\": {\n" +
            "        \"Ticket\": \"\",\n" +
            "        \"UserName\": \"\",\n" +
            "        \"Sex\": 0,\n" +
            "        \"AttrStatus\": 0,\n" +
            "        \"City\": \"\",\n" +
            "        \"NickName\": \"\",\n" +
            "        \"Scene\": 0,\n" +
            "        \"Province\": \"\",\n" +
            "        \"Content\": \"\",\n" +
            "        \"Alias\": \"\",\n" +
            "        \"Signature\": \"\",\n" +
            "        \"OpCode\": 0,\n" +
            "        \"QQNum\": 0,\n" +
            "        \"VerifyFlag\": 0\n" +
            "    },\n" +
            "    \"CreateTime\": 1494079411,\n" +
            "    \"NewMsgId\": 6942811558026846000,\n" +
            "    \"Text\": \"你好\",\n" +
            "    \"MsgType\": 1,\n" +
            "    \"groupMsg\": false,\n" +
            "    \"MsgId\": \"6942811558026845859\",\n" +
            "    \"StatusNotifyCode\": 0,\n" +
            "    \"AppInfo\": {\n" +
            "        \"Type\": 0,\n" +
            "        \"AppID\": \"\"\n" +
            "    },\n" +
            "    \"AppMsgType\": 0,\n" +
            "    \"Type\": \"Text\",\n" +
            "    \"PlayLength\": 0,\n" +
            "    \"MediaId\": \"\",\n" +
            "    \"Content\": \"你好\",\n" +
            "    \"StatusNotifyUserName\": \"\",\n" +
            "    \"FromUserName\": \"@a257b99314d8313862cd44ab02fe0f81\",\n" +
            "    \"OriContent\": \"\",\n" +
            "    \"FileSize\": \"\"\n" +
            "}";


    @Test
    public void testTextMassage() {
        System.out.println(WeChatJsonUtil.jsonToMessage(textMassage));
    }
}
