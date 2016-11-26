package rottmar.project.com.appwidgetclock.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by john on 26.11.2016.
 */

public class DateUtil {
    private GregorianCalendar cal = new GregorianCalendar();

    public String getTime(){
        int min = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        return hour + " : " + min;
    }

    public String getDate() {
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        return day + "." + month + "." + year;
    }
}
