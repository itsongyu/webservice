package com.syx.controller;

import cn.com.webxml.MobileCodeWSSoap;
import cn.cxf.service.WeatherInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired

    WeatherInterface wifi;

    @Autowired
     MobileCodeWSSoap mc;

    @RequestMapping(value = "/queryWeather",method = RequestMethod.GET)
    public String queryWeather( Model m ,String we){

        String result=wifi.queryWeather(we);
        m.addAttribute("weather",result);
        System.out.println(we);
        return "index";
    }


    @RequestMapping(value = "/queryMobileCode",method = RequestMethod.GET)
    public String queryMobileCode( Model m ,String we,String number){
        String result=mc.getMobileCodeInfo(number,"");
        m.addAttribute("MobileCode",result);
        return "index";
    }

}
