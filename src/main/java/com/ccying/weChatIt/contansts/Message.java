package com.ccying.weChatIt.contansts;

/**
 * Created by creatchen on 2017/6/7.
 */
public class Message {

    private int SubMsgType;
    private int VoiceLength;
    private String FileName;
    private int ImgHeight;
    private int ImgWidth;
    private String ToUserName;
    private int HasProductId;
    private int ImgStatus;
    private String Url;
    private int ForwardFlag;
    private int Status;
    private String Ticket;

    private RecommendInfo recommendInfo;

    private long CreateTime;
    private long NewMsgId;
    private String Text;
    private int MsgType;
    private boolean groupMsg;
    private String MsgId;
    private int StatusNotifyCode;

    private AppInfo appInfo;

    //    "AppMsgType": 0,
    private int AppMsgType;
    //            "Type": "Text",
    private String Type;
    //            "PlayLength": 0,
    private int PlayLength;
    //            "MediaId": "",
    private String MediaId;
    //            "Content": "你好",
    private String content;
    //            "StatusNotifyUserName": "",
    private String StatusNotifyUserName;
    //            "FromUserName": "@a257b99314d8313862cd44ab02fe0f81",
    private String FromUserName;
    //            "OriContent": "",
    private String OriContent;
    //            "FileSize": ""
    private String FileSize;

    public int getSubMsgType() {
        return SubMsgType;
    }

    public void setSubMsgType(int subMsgType) {
        SubMsgType = subMsgType;
    }

    public int getVoiceLength() {
        return VoiceLength;
    }

    public void setVoiceLength(int voiceLength) {
        VoiceLength = voiceLength;
    }

    public String getFileName() {
        return FileName;
    }

    public void setFileName(String fileName) {
        FileName = fileName;
    }

    public double getImgHeight() {
        return ImgHeight;
    }

    public void setImgHeight(int imgHeight) {
        ImgHeight = imgHeight;
    }

    public int getImgWidth() {
        return ImgWidth;
    }

    public void setImgWidth(int imgWidth) {
        ImgWidth = imgWidth;
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public int getHasProductId() {
        return HasProductId;
    }

    public void setHasProductId(int hasProductId) {
        HasProductId = hasProductId;
    }

    public int getImgStatus() {
        return ImgStatus;
    }

    public void setImgStatus(int imgStatus) {
        ImgStatus = imgStatus;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public int getForwardFlag() {
        return ForwardFlag;
    }

    public void setForwardFlag(int forwardFlag) {
        ForwardFlag = forwardFlag;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public RecommendInfo getRecommendInfo() {
        return recommendInfo;
    }

    public void setRecommendInfo(RecommendInfo recommendInfo) {
        this.recommendInfo = recommendInfo;
    }

    public long getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(long createTime) {
        CreateTime = createTime;
    }

    public long getNewMsgId() {
        return NewMsgId;
    }

    public void setNewMsgId(long newMsgId) {
        NewMsgId = newMsgId;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getMsgType() {
        return MsgType;
    }

    public void setMsgType(int msgType) {
        MsgType = msgType;
    }

    public boolean isGroupMsg() {
        return groupMsg;
    }

    public void setGroupMsg(boolean groupMsg) {
        this.groupMsg = groupMsg;
    }

    public String getMsgId() {
        return MsgId;
    }

    public void setMsgId(String msgId) {
        MsgId = msgId;
    }

    public int getStatusNotifyCode() {
        return StatusNotifyCode;
    }

    public void setStatusNotifyCode(int statusNotifyCode) {
        StatusNotifyCode = statusNotifyCode;
    }

    public AppInfo getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    public int getAppMsgType() {
        return AppMsgType;
    }

    public void setAppMsgType(int appMsgType) {
        AppMsgType = appMsgType;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public int getPlayLength() {
        return PlayLength;
    }

    public void setPlayLength(int playLength) {
        PlayLength = playLength;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatusNotifyUserName() {
        return StatusNotifyUserName;
    }

    public void setStatusNotifyUserName(String statusNotifyUserName) {
        StatusNotifyUserName = statusNotifyUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public String getOriContent() {
        return OriContent;
    }

    public void setOriContent(String oriContent) {
        OriContent = oriContent;
    }

    public String getFileSize() {
        return FileSize;
    }

    public void setFileSize(String fileSize) {
        FileSize = fileSize;
    }

    @Override
    public String toString() {
        return "Message{" +
                "SubMsgType=" + SubMsgType +
                ", VoiceLength=" + VoiceLength +
                ", FileName='" + FileName + '\'' +
                ", ImgHeight=" + ImgHeight +
                ", ImgWidth=" + ImgWidth +
                ", ToUserName='" + ToUserName + '\'' +
                ", HasProductId=" + HasProductId +
                ", ImgStatus=" + ImgStatus +
                ", Url='" + Url + '\'' +
                ", ForwardFlag=" + ForwardFlag +
                ", Status=" + Status +
                ", Ticket='" + Ticket + '\'' +
                ", recommendInfo=" + recommendInfo +
                ", CreateTime=" + CreateTime +
                ", NewMsgId=" + NewMsgId +
                ", Text='" + Text + '\'' +
                ", MsgType=" + MsgType +
                ", groupMsg=" + groupMsg +
                ", MsgId='" + MsgId + '\'' +
                ", StatusNotifyCode=" + StatusNotifyCode +
                ", appInfo=" + appInfo +
                ", AppMsgType=" + AppMsgType +
                ", Type='" + Type + '\'' +
                ", PlayLength=" + PlayLength +
                ", MediaId='" + MediaId + '\'' +
                ", content='" + content + '\'' +
                ", StatusNotifyUserName='" + StatusNotifyUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", OriContent='" + OriContent + '\'' +
                ", FileSize='" + FileSize + '\'' +
                '}';
    }



}

