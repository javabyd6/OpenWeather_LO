package pl.sda.openweather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;

import java.io.IOException;
import java.net.URL;

public class WeatherService {

    private String finalURL;


    public WeatherService(String url, String apiKey){
        finalURL = url + "?key=" +apiKey +"&q=";
    }

    public Weather getCityWeather(String city){

        ObjectMapper mapper = new ObjectMapper();
        Weather weather = null;
        try {

            URL url = new URL(finalURL+city);
            weather = mapper.readValue(url, Weather.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }

}
