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

    public static String getWindDirConverted(List<Reading> readings)
    {
        Reading readinglist = null;
        String dir = null;
        if (readings.size() > 0 ){

            readinglist = readings.get(readings.size() -1 );

            if(readinglist.winddirection >= 0 && readinglist.winddirection <= 11.25) {
                dir = "North";
            } else if (readinglist.winddirection >11.25 && readinglist.winddirection <= 33.75) {
                dir = "North-Northeast";
            }else if (readinglist.winddirection >33.75 && readinglist.winddirection <= 56.25) {
                dir = "Northeast";
            }else if (readinglist.winddirection >56.25 && readinglist.winddirection <= 78.75) {
                dir = "East-Northeast";
            }else if (readinglist.winddirection >78.75 && readinglist.winddirection <= 101.25) {
                dir = "East";
            }else if (readinglist.winddirection >101.25 && readinglist.winddirection <= 123.75) {
                dir = "East-Southeast";
            }else if (readinglist.winddirection >123.75 && readinglist.winddirection <= 146.25) {
                dir = "Southeast";
            }else if (readinglist.winddirection >146.25 && readinglist.winddirection <= 168.75) {
                dir = "South-Southeast";
            }else if (readinglist.winddirection >168.75 && readinglist.winddirection <= 191.25) {
                dir = "South";
            }else if (readinglist.winddirection >191.25 && readinglist.winddirection <= 213.75) {
                dir = "South-Southwest";
            }else if (readinglist.winddirection >213.75 && readinglist.winddirection <= 236.25) {
                dir = "Southwest";
            }else if (readinglist.winddirection >236.25 && readinglist.winddirection <= 258.75) {
                dir = "West-Southwest";
            }else if (readinglist.winddirection >258.75 && readinglist.winddirection <= 281.25) {
                dir = "West";
            }else if (readinglist.winddirection >281.25 && readinglist.winddirection <= 303.75) {
                dir = "West-Northwest";
            }else if (readinglist.winddirection >303.75 && readinglist.winddirection <= 326.25) {
                dir = "Northwest";
            }else if (readinglist.winddirection >326.25 && readinglist.winddirection <= 348.75) {
                dir = "North-Northwest";
            }
        }
        return dir;
    }
}
