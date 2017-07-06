package com.prakriti.myapplication.Pojo;

/**
 * Created by aprakriti on 5/4/2017.
 */

public class UserInfo {
    public  String id, sId;
    public String username;
    public String name;
    public   String password;
    public   String email;
    public String contact;


    public UserInfo(){

    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public UserInfo(String id, String username, String name, String password, String email, String contact) {
        this.username = username;
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.contact = contact;


    }}




