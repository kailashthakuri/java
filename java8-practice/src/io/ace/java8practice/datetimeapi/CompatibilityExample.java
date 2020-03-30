package io.ace.java8practice.datetimeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/*
 toInstant() method  is  added to old Data and Calender objects to convert to new Data-Time APIs.
 */
public class CompatibilityExample {
    public static void main(String[] args) {
        testBackwardCompatibilty();
    }

    private static void testBackwardCompatibilty() {
        Date date = new Date();
        Instant instant = date.toInstant();
        ZonedDateTime dateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Katmandu"));
        System.out.println(dateTime);

        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDate);

    }
}
