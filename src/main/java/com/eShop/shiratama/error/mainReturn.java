package com.eShop.shiratama.error;

//统一接口返回
public class mainReturn {
    private Boolean status = true;
    private int code = 200;
    private String message;
    private Object data;
    public static mainReturn ok(Object data) {
        return new mainReturn(data);
    }
    public mainReturn(Object data) {
        super();
        this.data = data;
    }
    public mainReturn() {
        super();
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
}
