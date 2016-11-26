package rottmar.project.com.appwidgetclock.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by john on 26.11.2016.
 */
public class DateUtilTest {

    /**
     * generiere mir die Zeit
     * @throws Exception
     */
    @Test
    public void getTime() throws Exception {
        DateUtil dateUtil = new DateUtil();
        String date = dateUtil.getTime();
        System.out.printf(date);
    }

    /**
     * generiere mir das Datum
     * @throws Exception
     */
    @Test
    public void getDate() throws Exception {
        DateUtil dateUtil = new DateUtil();
        String date = dateUtil.getDate();
        System.out.printf(date);
    }

}