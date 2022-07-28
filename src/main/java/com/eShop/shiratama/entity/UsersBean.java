package com.eShop.shiratama.entity;

import com.baomidou.mybatisplus.annotation.TableName;

public class UsersBean {
    private int id;
    private String username;
    private String password;
    private String fromTeacher;
    private String fromClass;
    private String studentName;
    private int status;

    public UsersBean() {
    }

    public UsersBean(int id, String username, String password, String fromTeacher, String fromClass, String studentName, int status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fromTeacher = fromTeacher;
        this.fromClass = fromClass;
        this.studentName = studentName;
        this.status = status;
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

    public String getFromTeacher() {
        return fromTeacher;
    }

    public void setFromTeacher(String fromTeacher) {
        this.fromTeacher = fromTeacher;
    }

    public String getFromClass() {
        return fromClass;
    }

    public void setFromClass(String fromClass) {
        this.fromClass = fromClass;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UsersBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fromTeacher='" + fromTeacher + '\'' +
                ", fromClass='" + fromClass + '\'' +
                ", studentName='" + studentName + '\'' +
                ", status=" + status +
                '}';
    }
}
