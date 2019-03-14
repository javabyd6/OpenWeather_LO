package pl.sda.openweather;


import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.openweather.model.Weather;
import pl.sda.openweather.service.WeatherService;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {

        WeatherService weatherService = new WeatherService(
                "http://api.apixu.com/v1/current.json",
                "d48c0d5e40054b6a9e571834181808"
        );

       Weather weather = weatherService.getCityWeather("Torun");
       System.out.println(weather.getCurrent().getTemp_c());
    }
}
