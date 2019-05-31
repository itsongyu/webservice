package com.syx.test;

import com.syx.weather_annotaion.WeatherInterfaceImpl;
import com.syx.weather_annotaion.WeatherInterfaceImplService;

/**
 * Webservice第一个入门程序：客户端
 */
public class WeatherTest {

    public static void main(String[] args) {
        //创建服务
        WeatherInterfaceImplService ws = new WeatherInterfaceImplService();
        //获取服务类
        WeatherInterfaceImpl wl = ws.getPort(WeatherInterfaceImpl.class);
        //调用方法
        String weather = wl.getweather("北京");
        System.out.println(weather);
    }

}
