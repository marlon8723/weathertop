package utils;

import models.Reading;

import java.util.List;

public class WeatherConvertion {

    public static String getWeatherConverted(List<Reading> readings)
    {
        Reading readinglist = null;
        String weatherCondition = null;
        if (readings.size() > 0 ) {

            readinglist = readings.get(readings.size() - 1);

            if (readinglist.code >= 0 && readinglist.code < 200) {
                weatherCondition = "Clear";
            } else if (readinglist.code >= 200 && readinglist.code < 300) {
                weatherCondition = "Partial clouds";
            } else if (readinglist.code >= 300 && readinglist.code < 400) {
                weatherCondition = "Cloudy";
            } else if (readinglist.code >= 400 && readinglist.code < 500) {
                weatherCondition = "Light Showers";
            } else if (readinglist.code >= 500 && readinglist.code < 600) {
                weatherCondition = "Heavy Showers";
            } else if (readinglist.code >= 600 && readinglist.code < 700) {
                weatherCondition = "Rain";
            } else if (readinglist.code >= 700 && readinglist.code < 800) {
                weatherCondition = "Snow";
            } else if (readinglist.code >= 800) {
                weatherCondition = "Thunder";
            }
        }
        return weatherCondition;
    }
}
