package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
    public static void index() {
        Logger.info("Rendering Dashboard");

        List<Station> stations = Station.findAll();
        render ("dashboard.html", stations);
    }

    public static void deleteStation (Long id)
    {
        Station station = Station.findById(id);
        Logger.info("Removing station " + station.stname);
        station.delete();
        redirect("/dashboard");
    }

    public static void addStation (String stname)
    {
        Station station = new Station(stname);
        Logger.info("Adding a new station called " + stname );
        station.save();
        redirect("/dashboard");
    }
}
