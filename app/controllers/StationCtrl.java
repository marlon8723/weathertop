package controllers;

import models.Reading;
import models.Station;
import play.Logger;
import play.mvc.Controller;
import utils.StationAnalytics;
import utils.TempConvertion;
import utils.WeatherConvertion;
import utils.WindConvertion;

public class StationCtrl extends Controller
{
    public static void index(Long id)
    {
        Station station = Station.findById(id);
        Logger.info ("Station id = " + id);

        Reading latestReading = StationAnalytics.getLatestReading(station.readings);
        double fahrenheit = TempConvertion.getTempConverted(station.readings);
        String weatherCondition = WeatherConvertion.getWeatherConverted(station.readings);
        double beaufort = WindConvertion.getWindConverted(station.readings);
        String dir = WindConvertion.getWindDirConverted(station.readings);

        render("station.html", station, latestReading, fahrenheit, weatherCondition, beaufort, dir );
    }

    public static void deleteReading (Long id, Long readingid)
    {
        Station station = Station.findById(id);
        Reading reading = Reading.findById(readingid);
        Logger.info("Removing reading from Station " + station.stname);
        station.readings.remove(reading);
        station.save();
        reading.delete();
        render("station.html", station);
    }

    public static void addReading(Long id,int code, double temp, double windspeed, double winddirection, int pressure)
    {
        Reading reading = new Reading(code, temp, windspeed,winddirection, pressure);
        Station station = Station.findById(id);
        station.readings.add(reading);
        station.save();
        redirect("/stations/" + id );

    }

}
