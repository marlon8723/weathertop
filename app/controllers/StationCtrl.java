package controllers;

import java.util.List;

import models.Reading;
import models.Station;
import play.Logger;
import play.mvc.Controller;
import utils.StationAnalytics;

public class StationCtrl extends Controller
{
    public static void index(Long id)
    {
        Station station = Station.findById(id);
        Logger.info ("Station id = " + id);
        Reading latestReading = StationAnalytics.getLatestReading(station.readings);

        render("station.html", station, latestReading);
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

    public static void addReading(Long id,int code, double temp, double windspeed,int pressure)
    {
        Reading reading = new Reading(code, temp, windspeed, pressure);
        Station station = Station.findById(id);
        station.readings.add(reading);
        station.save();
        redirect("/stations/" + id );

    }

}
