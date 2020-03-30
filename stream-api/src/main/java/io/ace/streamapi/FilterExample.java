package io.ace.streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kailash", "Ashok", "Dipendra", "Nirajan", "Kshitij");

        /**
         * Without Stream
         * Using for-each
         */
        for (String name : names) {
            if (name.startsWith("K")) {
                System.out.println(name);
            }
        }
        /**
         * With Stream
         */
        names.stream()
                .filter(FilterExample::startWithK)
                .forEach(System.out::println);

    }

    private static boolean startWithK(String name) {
        return name.startsWith("K");
    }
}
