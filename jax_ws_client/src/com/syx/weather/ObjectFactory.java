
package com.syx.weather;

import com.syx.weather.QueryWeather;
import com.syx.weather.QueryWeatherResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.syx.weather package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryWeatherResponse_QNAME = new QName("http://weather.syx.com/", "queryWeatherResponse");
    private final static QName _QueryWeather_QNAME = new QName("http://weather.syx.com/", "queryWeather");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.syx.weather
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.syx.weathear.QueryWeather }
     *
     */
    public com.syx.weather.QueryWeather createQueryWeather() {
        return new com.syx.weather.QueryWeather();
    }

    /**
     * Create an instance of {@link com.syx.weather.QueryWeatherResponse }
     *
     */
    public com.syx.weather.QueryWeatherResponse createQueryWeatherResponse() {
        return new com.syx.weather.QueryWeatherResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.syx.weather.QueryWeatherResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://weather.syx.com/", name = "queryWeatherResponse")
    public JAXBElement<com.syx.weather.QueryWeatherResponse> createQueryWeatherResponse(com.syx.weather.QueryWeatherResponse value) {
        return new JAXBElement<com.syx.weather.QueryWeatherResponse>(_QueryWeatherResponse_QNAME, QueryWeatherResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.syx.weather.QueryWeather }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://weather.syx.com/", name = "queryWeather")
    public JAXBElement<com.syx.weather.QueryWeather> createQueryWeather(com.syx.weather.QueryWeather value) {
        return new JAXBElement<com.syx.weather.QueryWeather>(_QueryWeather_QNAME, QueryWeather.class, null, value);
    }

}
