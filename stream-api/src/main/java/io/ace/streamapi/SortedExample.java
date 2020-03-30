package io.ace.streamapi;

import java.util.Optional;
import java.util.stream.Stream;

public class SortedExample {
    public static void main(String[] args) {
        Optional<String> first = Stream.of("Kailash", "Ashok", "Bijay", "Yethest")
                .sorted()
                .findFirst();
        first.ifPresent(System.out::println);
    }
}
