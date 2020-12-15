package com.harunugur.exceptions;

import com.harunugur.util.ErrorCode;

public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException() {
        super(ErrorCode.DATA_NOT_FOUND.getMsg());
    }
}
