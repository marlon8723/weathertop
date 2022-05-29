package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Reading extends Model
{

    public int code;
    public double temp;
    public double windspeed;
    public double winddirection;
    public int pressure;

    public Reading(int code, double temp, double windspeed, double winddirection, int pressure)
    {
        this.code = code;
        this.temp = temp;
        this.windspeed = windspeed;
        this.pressure = pressure;
        this.winddirection = winddirection;
    }
}
