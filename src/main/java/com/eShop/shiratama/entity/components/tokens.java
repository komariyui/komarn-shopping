package com.eShop.shiratama.entity.components;

import java.util.Date;

public class tokens {
    private Integer id;
    private String username;
    private String token_code;
    private Date login_time;
    private Date validity_period;
    private Date is_long_token;

    public tokens() {
    }

    public tokens(Integer id, String username, String token_code, Date login_time, Date validity_period, Date is_long_token) {
        this.id = id;
        this.username = username;
        this.token_code = token_code;
        this.login_time = login_time;
        this.validity_period = validity_period;
        this.is_long_token = is_long_token;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken_code() {
        return token_code;
    }

    public void setToken_code(String token_code) {
        this.token_code = token_code;
    }

    public Date getLogin_time() {
        return login_time;
    }

    public void setLogin_time(Date login_time) {
        this.login_time = login_time;
    }

    public Date getValidity_period() {
        return validity_period;
    }

    public void setValidity_period(Date validity_period) {
        this.validity_period = validity_period;
    }

    public Date getIs_long_token() {
        return is_long_token;
    }

    public void setIs_long_token(Date is_long_token) {
        this.is_long_token = is_long_token;
    }
}
