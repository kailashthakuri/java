package io.ace.streamapi;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatisticsExample {
    public static void main(String[] args) {
        /**
         * Summary Statistics only works on IntStream.
         */

        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 3, 4)
                .summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
