package io.ace.java8practice.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Three Important classess
 * 1. LocalDateTime 2.LocalDate 3.LocalTime
 */

public class LocalDateTimeApiExample {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime " + currentDateTime);

        Month month = currentDateTime.getMonth();
        int dayOfMonth = currentDateTime.getDayOfMonth();


        LocalDate currentDate = currentDateTime.toLocalDate();
        System.out.println("Current LocalDate : " + currentDate);

        LocalTime currentTime = currentDateTime.toLocalTime();
        System.out.println("Curretn LocalTime : " + currentTime);


        LocalDateTime localDateTime = currentDateTime.withDayOfMonth(1).withDayOfYear(2012);


    }
}
