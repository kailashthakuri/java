package io.ace.java9practice.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<Optional<String>> list = Arrays.asList(
                Optional.of("Kailash"),
                Optional.empty(),
                Optional.of("Ashok"),
                Optional.empty()
        );

        List<String> collect = list.stream()
                .flatMap(x -> x.isPresent() ? Stream.of(x.get()) : Stream.empty())
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
