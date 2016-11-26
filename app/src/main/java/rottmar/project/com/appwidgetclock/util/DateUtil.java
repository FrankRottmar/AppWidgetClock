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

        String time = null;

        if(cal.get(Calendar.HOUR_OF_DAY) <= 9 && cal.get(Calendar.MINUTE) <= 9){
            time = "0" + hour +":" + "0" + min;
        }else if(cal.get(Calendar.HOUR_OF_DAY)>= 10 && cal.get(Calendar.MINUTE) <= 9){
           time = hour +":" + "0" + min;
        }else if(cal.get(Calendar.HOUR_OF_DAY) <= 9 && cal.get(Calendar.MINUTE) >= 10){
            time = "0" + hour +":" + min;
        }else  {
            time = hour + ":" + min;
        }

        return time;
    }

    public String getDate() {
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        return day + "." + month + "." + year;
    }
}
