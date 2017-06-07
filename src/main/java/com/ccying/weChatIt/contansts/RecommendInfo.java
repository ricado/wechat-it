package com.ccying.weChatIt.contansts;

/**
 * Created by creatchen on 2017/6/7.
 */
public class RecommendInfo {
    //         "Ticket": "",
    private String Ticket;
    //                 "UserName": "",
    private String UserName;
    //                 "Sex": 0,
    private int Sex;
    //                 "AttrStatus": 0,
    private int AttrStatus;
    //                 "City": "",
    private String City;
    //                 "NickName": "",
    private String NickName;
    //                 "Scene": 0,
    private int Scene;
    //                 "Province": "",
    private String Province;
    //                 "Content": "",
    private String Content;
    //                 "Alias": "",
    private String Alias;
    //                 "Signature": "",
    private String Signature;
    //                 "OpCode": 0,
    private int OpCode;
    //                 "QQNum": 0,
    private int QQNum;
    //                 "VerifyFlag": 0
    private int VerifyFlag;

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int sex) {
        Sex = sex;
    }

    public int getAttrStatus() {
        return AttrStatus;
    }

    public void setAttrStatus(int attrStatus) {
        AttrStatus = attrStatus;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getScene() {
        return Scene;
    }

    public void setScene(int scene) {
        Scene = scene;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public int getOpCode() {
        return OpCode;
    }

    public void setOpCode(int opCode) {
        OpCode = opCode;
    }

    public int getQQNum() {
        return QQNum;
    }

    public void setQQNum(int QQNum) {
        this.QQNum = QQNum;
    }

    public int getVerifyFlag() {
        return VerifyFlag;
    }

    public void setVerifyFlag(int verifyFlag) {
        VerifyFlag = verifyFlag;
    }

    @Override
    public String toString() {
        return "RecommendInfo{" +
                "Ticket='" + Ticket + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Sex=" + Sex +
                ", AttrStatus=" + AttrStatus +
                ", City='" + City + '\'' +
                ", NickName='" + NickName + '\'' +
                ", Scene=" + Scene +
                ", Province='" + Province + '\'' +
                ", Content='" + Content + '\'' +
                ", Alias='" + Alias + '\'' +
                ", Signature='" + Signature + '\'' +
                ", OpCode=" + OpCode +
                ", QQNum=" + QQNum +
                ", VerifyFlag=" + VerifyFlag +
                '}';
    }
}
