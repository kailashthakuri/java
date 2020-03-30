package io.ace.java8practice.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterExample {
    public static void main(String[] args) {
        TemporalAdjusterExample temporalAdjusterExample = new TemporalAdjusterExample();
        temporalAdjusterExample.testTemporalAdjuster();
    }

    private void testTemporalAdjuster() {
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);

        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMonday);

        //get the second saturday of next month
        LocalDate firstInYear = LocalDate.of(today.getYear(), today.getMonth(), 1);
        LocalDate secondSaturday = firstInYear.with(TemporalAdjusters.nextOrSame(
                DayOfWeek.SATURDAY)).with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

    }
}
