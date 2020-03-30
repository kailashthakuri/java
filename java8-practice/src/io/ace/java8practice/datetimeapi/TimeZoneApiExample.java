package io.ace.java8practice.datetimeapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Important Classes
 * 1. ZonedDateTime 2. ZoneId
 */
public class TimeZoneApiExample {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.now();
        System.out.println(dateTime);

        ZoneId kathmanduId = ZoneId.of("Asia/Katmandu");
        System.out.println(kathmanduId);

        System.out.println(ZoneId.systemDefault());
    }
}
