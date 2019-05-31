package weather;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {

    String queryWeather(String name);
}
