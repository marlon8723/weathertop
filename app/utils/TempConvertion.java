package utils;

import models.Reading;

import java.util.List;

public class TempConvertion {
    public static double getTempConverted(List<Reading> readings)
    {
        Reading readinglist = null;
        double fahrenheit = 0;
        if (readings.size() > 0 )
        {

            readinglist = readings.get(readings.size() -1 );
            fahrenheit = (readinglist.temp *1.8) +32 ;

        }
        return fahrenheit;
    }
}
