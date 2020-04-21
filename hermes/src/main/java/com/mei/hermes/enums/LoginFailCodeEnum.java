package com.mei.hermes.enums;

public enum LoginFailCodeEnum {

    UNKNOW_ACCOUNT("1000", "error.user.login.usernotexsist"),
    ACCOUNT_DISABLE("1001", "error.user.login.notactive"),
    PWD_INCORRECT("1002", "error.user.login.passworderror"),
    ACCOUNT_LOCKED("1003", "error.user.login.locked");


    private String code;
    private String desc;

    LoginFailCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
