package com.mayikt.entity;

import lombok.Data;

@Data
public class MayiktUserEntity {
    public String name;
    public Integer id;
    public String password;
    public String account;
    public String phonenumber;

    public MayiktUserEntity(String name, Integer id, String password, String account, String phonenumber) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.account = account;
        this.phonenumber = phonenumber;
    }

    public MayiktUserEntity() {
    }
    @Override
    public String toString() {
        return "MayiktUserEntity{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", account='" + account + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
