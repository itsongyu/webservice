package com.restful.service;

import com.restful.pojo.User;

public class Serviceimpl implements Service {

    @Override
    public User queryByName(String callback) {

        if (callback.equals("日本")) {
            User u=new User();
            u.setAddress("富士山下！！");
            u.setName("日本");
            return u;
        }
       else {
            User u=new User();
            u.setAddress("黄河落日圆！！！");
            u.setName(callback);
            return u;
        }
    }

    @Override
    public User queryById(String callback) {
        if (callback.equals("1")) {
            User u=new User();
            u.setAddress("富士山下！！");
            u.setName("日本");
            return u;
        }
        else {
            User u=new User();
            u.setAddress("黄河落日圆！！！");
            u.setName(callback);
            return u;
        }
    }

}
