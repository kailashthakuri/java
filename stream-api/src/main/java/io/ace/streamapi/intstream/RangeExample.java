package io.ace.streamapi.intstream;

import java.util.stream.IntStream;

public class RangeExample {
    public static void main(String[] args) {
        IntStream.range(1, 5)
                .forEach(System.out::println);

        IntStream.range(1, 10)
                .skip(5)
                .forEach(System.out::println);

        IntStream.range(1, 10)
                .skip(5)
                .sum();
    }
}
