package io.ace.java8practice.datetimeapi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Enum ChronoUnit
 */

public class ChronoUnitEnumExample {
    public static void main(String[] args) {
        //  Get the  current date.
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // Add 1 month to the current date.
        LocalDate nextMonth = today.plus(1, ChronoUnit.MONTHS);
        System.out.println(nextMonth);

    }
}
