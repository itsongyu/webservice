
package weather;


public class WeatherInterfaceImpl implements WeatherInterface {

    @Override
    public String queryWeather( String cityname) {

        if (cityname.equals("日本")) {
            return cityname + "全天多云！！！";
        }
        return cityname + "全天多雨！！！";
    }
}