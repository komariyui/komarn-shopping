package com.eShop.shiratama.entity;


public class ClassifyBean {
    private Integer id;
    private String level_one_name;
    private Integer level_one_code;
    private String level_two_name;
    private Integer level_two_code;
    private String level_two_image;
    private String level_two_information;
    private String level_two_group;
    private String level_two_group_information;

    public ClassifyBean() {
    }

    public ClassifyBean(Integer id, String level_one_name, Integer level_one_code, String level_two_name, Integer level_two_code, String level_two_image, String level_two_information, String level_two_group, String level_two_group_information) {
        this.id = id;
        this.level_one_name = level_one_name;
        this.level_one_code = level_one_code;
        this.level_two_name = level_two_name;
        this.level_two_code = level_two_code;
        this.level_two_image = level_two_image;
        this.level_two_information = level_two_information;
        this.level_two_group = level_two_group;
        this.level_two_group_information = level_two_group_information;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel_one_name() {
        return level_one_name;
    }

    public void setLevel_one_name(String level_one_name) {
        this.level_one_name = level_one_name;
    }

    public Integer getLevel_one_code() {
        return level_one_code;
    }

    public void setLevel_one_code(Integer level_one_code) {
        this.level_one_code = level_one_code;
    }

    public String getLevel_two_name() {
        return level_two_name;
    }

    public void setLevel_two_name(String level_two_name) {
        this.level_two_name = level_two_name;
    }

    public Integer getLevel_two_code() {
        return level_two_code;
    }

    public void setLevel_two_code(Integer level_two_code) {
        this.level_two_code = level_two_code;
    }

    public String getLevel_two_image() {
        return level_two_image;
    }

    public void setLevel_two_image(String level_two_image) {
        this.level_two_image = level_two_image;
    }

    public String getLevel_two_information() {
        return level_two_information;
    }

    public void setLevel_two_information(String level_two_information) {
        this.level_two_information = level_two_information;
    }

    public String getLevel_two_group() {
        return level_two_group;
    }

    public void setLevel_two_group(String level_two_group) {
        this.level_two_group = level_two_group;
    }

    public String getLevel_two_group_information() {
        return level_two_group_information;
    }

    public void setLevel_two_group_information(String level_two_group_information) {
        this.level_two_group_information = level_two_group_information;
    }
}
