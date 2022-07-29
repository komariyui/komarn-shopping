package com.eShop.shiratama.error;

public class globalExceptions extends Exception {
//    private static final long serialVersionUID = -5701182284190108797L;
    private int code;
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }

    public globalExceptions(String message) {
        super(message);
    }
    public globalExceptions(String message, int code) {
        super(message);
        this.code = code;
    }
}
