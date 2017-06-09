package com.ccying.weChatIt.contansts;

/**
 * Created by creatchen on 2017/6/7.
 */
public class AppInfo {
    private int Type;
    private String AppID;

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getAppID() {
        return AppID;
    }

    public void setAppID(String appID) {
        AppID = appID;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "Type=" + Type +
                ", AppID='" + AppID + '\'' +
                '}';
    }
}
