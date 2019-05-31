package com.syx.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * 注解修改WSDL内容
 */
//@BindingType(SOAPBinding.SOAP12HTTP_BINDING) 发布SOAP1.2服务端  1.8jdk已经支持soap1.2版本
//@WebMethod(operationName = "fondWeather")  @WebResult(name = "result")   @WebParam(name ="cityname")
public class WeatherInterfaceImpl implements WeatherInterface {

   @Override
    public  String queryWeather( String cityname) {

        if (cityname.equals("日本")) {
            return cityname + "全天多云转晴！！！";
        }
        return cityname + "全天多雨！！！";
    }
}
