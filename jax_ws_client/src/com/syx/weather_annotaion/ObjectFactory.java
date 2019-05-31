
package com.syx.weather_annotaion;

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

    private final static QName _Getweather_QNAME = new QName("http://weather.syx.com", "getweather");
    private final static QName _GetweatherResponse_QNAME = new QName("http://weather.syx.com", "getweatherResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.syx.weather
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetweatherResponse }
     * 
     */
    public GetweatherResponse createGetweatherResponse() {
        return new GetweatherResponse();
    }

    /**
     * Create an instance of {@link Getweather }
     * 
     */
    public Getweather createGetweather() {
        return new Getweather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getweather }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather.syx.com", name = "getweather")
    public JAXBElement<Getweather> createGetweather(Getweather value) {
        return new JAXBElement<Getweather>(_Getweather_QNAME, Getweather.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetweatherResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://weather.syx.com", name = "getweatherResponse")
    public JAXBElement<GetweatherResponse> createGetweatherResponse(GetweatherResponse value) {
        return new JAXBElement<GetweatherResponse>(_GetweatherResponse_QNAME, GetweatherResponse.class, null, value);
    }

}
