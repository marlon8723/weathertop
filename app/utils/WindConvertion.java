package utils;

import models.Reading;

import java.util.List;

public class WindConvertion {

    public static double getWindConverted(List<Reading> readings)
    {
        Reading readinglist = null;
        double beaufort = 0;
        if (readings.size() > 0 )
        {

            readinglist = readings.get(readings.size() -1 );

        if (readinglist.windspeed < 1) {
            beaufort = 0;
        } else if (readinglist.windspeed >= 1 && readinglist.windspeed <= 5) {
            beaufort = 1;
        } else if (readinglist.windspeed >= 6 && readinglist.windspeed <= 11) {
            beaufort = 2;
        } else if (readinglist.windspeed >= 12 && readinglist.windspeed <= 19) {
            beaufort = 3;
        } else if (readinglist.windspeed >= 20 && readinglist.windspeed <= 28) {
            beaufort = 4;
        } else if (readinglist.windspeed >= 29 && readinglist.windspeed <= 38) {
            beaufort = 5;
        } else if (readinglist.windspeed >= 39 && readinglist.windspeed <= 49) {
            beaufort = 6;
        } else if (readinglist.windspeed >= 50 && readinglist.windspeed <= 61) {
            beaufort = 7;
        }else if (readinglist.windspeed >= 62 && readinglist.windspeed <= 74) {
            beaufort = 8;
        }else if (readinglist.windspeed >= 75 && readinglist.windspeed <= 88) {
            beaufort = 9;
        }else if (readinglist.windspeed >= 89 && readinglist.windspeed <= 102) {
            beaufort = 10;
        }else if (readinglist.windspeed >= 103 && readinglist.windspeed <= 117) {
            beaufort = 11;
        }else if (readinglist.windspeed >= 118) {
            beaufort = 11;
        }
    }
        return beaufort;
    }
}
