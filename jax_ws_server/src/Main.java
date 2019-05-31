import com.syx.weather.WeatherInterfaceImpl;

import javax.xml.ws.Endpoint;

/**
 * Webservice第一个入门程序：服务端
 */
public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:12345/weather?wsdl", new WeatherInterfaceImpl());
    }
}
