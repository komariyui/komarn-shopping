package com.eShop.shiratama.error;

public enum errorCodes {
    PARAM_ERROR_CODE(400),
    SERVER_ERROR_CODE(500);
    private int code;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    private errorCodes(int code) {
        this.code = code;
    }
}
