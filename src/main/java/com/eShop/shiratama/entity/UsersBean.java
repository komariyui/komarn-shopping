package com.eShop.shiratama.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springframework.boot.autoconfigure.domain.EntityScan;
public class UsersBean {
    private int id;
    private String username;
    private String password;
    private String verificationCode;


    public UsersBean() {
    }

    public UsersBean(int id, String username, String password, String verificationCode) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.verificationCode = verificationCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
}
