package com.harunugur.util;

import java.util.HashMap;

public enum ErrorCode {

    DATA_NOT_FOUND(0,"Data Not Found.");

    Integer code;
    String msg;

    ErrorCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private static HashMap<Integer,ErrorCode> lookup = new HashMap<>();

    static {
        for (ErrorCode value: values()) {
            lookup.put(value.getCode(),value);
        }
    }

    public String getErrorMessageByCode(Integer code){
        if (lookup.containsKey(code)) return lookup.get(code).getMsg();
        return null;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
