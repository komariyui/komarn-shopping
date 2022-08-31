package com.eShop.shiratama.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CollectionBean {
    private Integer id;
    private String username;
    private Integer commodity_id;
    private Date collection_time;

    public CollectionBean() {
    }

    public CollectionBean(Integer id, String username, Integer commodity_id, Date collection_time) {
        this.id = id;
        this.username = username;
        this.commodity_id = commodity_id;
        this.collection_time = collection_time;
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

    public Integer getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(Integer commodity_id) {
        this.commodity_id = commodity_id;
    }

    public Date getCollection_time() {
        return collection_time;
    }

    public void setCollection_time(Date collection_time) {
        this.collection_time = collection_time;
    }
}
