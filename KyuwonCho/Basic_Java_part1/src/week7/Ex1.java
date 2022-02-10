package week7;

import java.util.*;

public class Ex1 {
    public static void main() {
        Calendar today = Calendar.getInstance();
        System.out.println("올해 년도? " + today.get(Calendar.YEAR));
        System.out.println("월? " + today.get(Calendar.MONTH));
        System.out.println("올해의 몇째 주? " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("week of this month? " + today.get(Calendar.WEEK_OF_MONTH));
        // day of month = date
        System.out.println("day of month?(date) " + today.get(Calendar.DATE));
        System.out.println("day of month?(day of month) " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("day of year? " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("day of wee(1: sun ~ 7 sat)? " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("오전 오후? " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11)" + today.get(Calendar.HOUR));
        System.out.println("hour(0~23) " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("minute " + today.get(Calendar.MINUTE));
        System.out.println("second " + today.get(Calendar.SECOND));
        System.out.println("ms " + today.get(Calendar.MILLISECOND));
        System.out.println("TimeZone(-12 ~ +12) ms " + today.get(Calendar.ZONE_OFFSET)/(3600000));
        System.out.println("last day of month " + today.getActualMaximum(Calendar.DATE));
    }
}
