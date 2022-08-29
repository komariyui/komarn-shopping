package com.eShop.shiratama.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommodityBean {
    private Integer id;
    private String title;
    private String carousel;
    private Integer level_two_classify;
    private String information;
    private Integer shop_id;
    private String introduce;
    private Integer status;

    public CommodityBean() {
    }

    public CommodityBean(Integer id, String title, String carousel, Integer level_two_classify, String information, Integer shop_id, String introduce, Integer status) {
        this.id = id;
        this.title = title;
        this.carousel = carousel;
        this.level_two_classify = level_two_classify;
        this.information = information;
        this.shop_id = shop_id;
        this.introduce = introduce;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCarousel() {
        return carousel.split(",");
    }

    public void setCarousel(String carousel) {
        this.carousel = carousel;
    }

    public Integer getLevel_two_classify() {
        return level_two_classify;
    }

    public void setLevel_two_classify(Integer level_two_classify) {
        this.level_two_classify = level_two_classify;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
