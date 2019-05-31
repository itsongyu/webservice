package com.restful.test;

import java.io.Serializable;

public class UserEntity implements Serializable {
    private Long uid;
    private String name ;
    private String pwd;

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Long getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

}
