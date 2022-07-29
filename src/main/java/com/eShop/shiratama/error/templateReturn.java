package com.eShop.shiratama.error;


import java.util.HashMap;

//统一返回模板（success）
public class templateReturn {
    private int errno; //status code
    private Object data;
    private String errmsg;

    public templateReturn() {

    }

    //1.maybe return object
    public static templateReturn success(Object data,int errno,String errmsg){
        return new templateReturn(data,errno,errmsg);
    }
    public templateReturn(Object data,int errno,String errmsg) {
        this.data = data;
        this.errno = errno;
        this.errmsg = errmsg;
    }
    //2.maybe return string
    public static templateReturn success(String data,int errno,String errmsg){
        return new templateReturn(data,errno,errmsg);
    }
    public templateReturn(String data,int errno,String errmsg) {
        this.data = data;
        this.errno = errno;
        this.errmsg = errmsg;
    }


    public templateReturn(int errno, HashMap data, String errmsg) {
        this.errno = errno;
        this.data = data;
        this.errmsg = errmsg;
    }

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public Object getData() {
        return data;
    }

    public void setData(HashMap data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
