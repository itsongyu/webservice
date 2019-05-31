package com.syx.controller;

import com.alibaba.fastjson.JSON;
import com.restful.test.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Controller
public class UserController {

    // spring RestTemplate中文乱码解决-->
    @Bean
    public RestTemplate restTemplate() {

        RestTemplate restTemplate = new RestTemplate();

        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));

        return restTemplate;

    }

    private RestTemplate template = this.restTemplate();

    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
    public String queryByName(Model m, String we) {
        System.out.println(we);
        ResponseEntity<UserEntity> forEntity = template.getForEntity("http://127.0.0.1:8080/restful/user/queryn/{we}", UserEntity.class, we);
        m.addAttribute("byname", forEntity.getBody());
        System.out.println(forEntity.getBody());
        return "index";
    }

    @RequestMapping(value = "/queryById",method = RequestMethod.GET)
    public String queryById( Model m ,String number){
        UserEntity u = template.getForObject ("http://127.0.0.1:8080/restful/user/queryi/{number}", UserEntity.class, number);
        System.out.println(u);
        m.addAttribute("byid", u);
        System.out.println(u);
        return "index";
    }

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String query(){
        //     JSON.toJSONString  将对象转化为Json字符串
        //     JSON.parseObject    将Json字符串转化为相应的对象
        //     JSON.put("success", true);  添加json数据
        UserEntity u = template.getForObject ("http://localhost:8080/rest/user/getJson", UserEntity.class);

//        UserEntity jsonObject = JSON.parseObject(u, UserEntity.class);
        System.out.println(u.getName());
        return "index";
    }
}
