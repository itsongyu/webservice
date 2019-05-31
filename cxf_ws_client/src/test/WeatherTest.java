package test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import weather.WeatherInterface;

/**
 * CXF第一个入门程序：客户端
 */
public class WeatherTest {

    public static void main(String[] args) {

        //创建代理工厂
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        //设置服务器地址
        factoryBean.setAddress("http://127.0.0.1:12345/weather?wsdl");

        //获取服务类
        WeatherInterface weather = factoryBean.create(WeatherInterface.class);

        //调用方法
        String w = weather.queryWeather("北京");

        System.out.println(w);

    }

}
