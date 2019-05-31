package com.syx.weather;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {
    String queryWeather(String cityname);
}
