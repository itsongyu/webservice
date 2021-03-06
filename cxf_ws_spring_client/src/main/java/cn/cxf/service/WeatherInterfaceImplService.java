package cn.cxf.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2019-04-25T16:04:20.033+08:00
 * Generated source version: 2.7.11
 * 
 */
@WebServiceClient(name = "WeatherInterfaceImplService", 
                  wsdlLocation = "http://localhost:8080/ws/weather?wsdl",
                  targetNamespace = "http://weather.syx.com/") 
public class WeatherInterfaceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://weather.syx.com/", "WeatherInterfaceImplService");
    public final static QName WeatherInterfaceImplPort = new QName("http://weather.syx.com/", "WeatherInterfaceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws/weather?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherInterfaceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ws/weather?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherInterfaceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherInterfaceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherInterfaceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherInterfaceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherInterfaceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public WeatherInterfaceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfaceImplPort")
    public WeatherInterface getWeatherInterfaceImplPort() {
        return super.getPort(WeatherInterfaceImplPort, WeatherInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherInterface
     */
    @WebEndpoint(name = "WeatherInterfaceImplPort")
    public WeatherInterface getWeatherInterfaceImplPort(WebServiceFeature... features) {
        return super.getPort(WeatherInterfaceImplPort, WeatherInterface.class, features);
    }

}
