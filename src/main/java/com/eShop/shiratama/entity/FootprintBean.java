package com.eShop.shiratama.entity;

import java.util.Date;

public class FootprintBean {
    private Integer id;
    private String username;
    private String commodity_id;
    private Date interview_time;

    public FootprintBean() {
    }

    public FootprintBean(Integer id, String username, String commodity_id, Date interview_time) {
        this.id = id;
        this.username = username;
        this.commodity_id = commodity_id;
        this.interview_time = interview_time;
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

    public String getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(String commodity_id) {
        this.commodity_id = commodity_id;
    }

    public Date getInterview_time() {
        return interview_time;
    }

    public void setInterview_time(Date interview_time) {
        this.interview_time = interview_time;
    }
}
