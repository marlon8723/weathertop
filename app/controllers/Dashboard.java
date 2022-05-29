package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Member;
import models.Station;
import models.Reading;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
    public static void index() {
        Logger.info("Rendering Dashboard");
        Member member = Accounts.getLoggedInMember();
        List<Station> stations = member.stations;
        render ("dashboard.html", stations);
    }

    public static void deleteStation (Long id)
    {
        Logger.info("Removing station ");
        Member member = Accounts.getLoggedInMember();
        Station station = Station.findById(id);
        member.stations.remove(station);
        member.save();
        station.delete();
        redirect("/dashboard");
    }

    public static void addStation (String stname)
    {
        Logger.info("Adding a Station");
        Member member = Accounts.getLoggedInMember();
        Station playlist = new Station (stname);
        member.stations.add(playlist);
        member.save();
        redirect ("/dashboard");
    }
}
