import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import weather.WeatherInterfaceImpl;

/**
 * CXF框架第一个入门程序：服务端
 */
public class Main {
    public static void main(String[] args) {


        //创建服务工厂Bean
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();

        //设置服务实现对象
        factoryBean.setServiceBean(new WeatherInterfaceImpl());

        //设置服务发布地址
        factoryBean.setAddress("http://127.0.0.1:12345/weather");

        //创建服务
        factoryBean.create();

    }
}
