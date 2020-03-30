package io.ace.java8practice.datetimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationExample {
    public static void main(String[] args) {
        testPeriod();
        testDuration();
    }

    private static void testDuration() {
        LocalTime time1 = LocalTime.now();
        System.out.println(time1);
        Duration twoHours = Duration.ofHours(2);
        LocalTime time2 = time1.plus(twoHours);
        Duration between = Duration.between(time1, time2);
        System.out.println(between);
    }

    private static void testPeriod() {
        LocalDate todayDate = LocalDate.now();
        LocalDate monthLater = todayDate.plus(2, ChronoUnit.MONTHS);

        Period between = Period.between(todayDate, monthLater);
        System.out.println(between);
    }
}
