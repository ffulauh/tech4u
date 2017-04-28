package me.ffulauh.javalang;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by ffulauh on 2017/4/21.
 */
public class TimeUtils {
    public static void main(String[] args)throws Exception {
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date date=dateFormat.parse("2017-04-19");
        System.out.println(date);
        Calendar repaymentTime= Calendar.getInstance();
        repaymentTime.setTime(date);
        repaymentTime.set(Calendar.HOUR_OF_DAY,0);
        repaymentTime.set(Calendar.MINUTE,0);
        repaymentTime.set(Calendar.SECOND,0);

        long day=(new Date().getTime()-repaymentTime.getTime().getTime())/(24*60*60*1000);
        System.out.println(day);
    }

}
