package com.jersey.service;

import com.alibaba.fastjson.JSONObject;
import com.jersey.bean.User;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/user")
public class UserController {

    /**
     * 返回字符串
     *
     * @return
     */
    @GET
    @Path("/str")
    @Produces(MediaType.TEXT_PLAIN)
    public String str() {
        System.out.println("Hello,Jersey !");
        return "Hello,Jersey !";
    }

    /**
     * 返回xml
     *
     * @return
     */
    @GET
    @Path("/getXml")
    @Produces(MediaType.APPLICATION_XML)
    public User getUserXml() {
        User user = new User();
        user.setUid(234234l);
        user.setName("隔壁老王");
        user.setPwd("rwerwe");
        System.out.println(user);
        return user;
    }

    /**
     * 返回json
     *
     * @return
     */
    @GET
    @Path("/getJson")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserJson() {
        User user = new User();
        user.setUid(1l);
        user.setName("隔壁老王");
        user.setPwd("123456");
        System.out.println(user);
        return user;
    }

    /**
     * 用户注册
     *
     * @param uname
     * @param pwd
     * @return
     */
    @POST
    @Path("/register")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String register(@FormParam(value = "uname") String uname,
                           @FormParam(value = "pwd") String pwd) {
        User user = new User();
        user.setName(uname);
        user.setPwd(pwd);
        //     JSON.toJSONString  将对象转化为Json字符串
        //     JSON.parseObject    将Json字符串转化为相应的对象
        //     JSON.put("success", true);  添加json数据
        JSONObject object = new JSONObject();
        System.out.println(object.toJSONString(user));
        return object.toJSONString(user);

    }

}
