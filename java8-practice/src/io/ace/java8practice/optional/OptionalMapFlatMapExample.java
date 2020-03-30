package io.ace.java8practice.optional;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyValue = Optional.of("Male");
        Optional<String> emptyValue = Optional.empty();

        System.out.println(nonEmptyValue.map(String::toUpperCase));
        System.out.println(emptyValue.map(String::toUpperCase));

        Optional<Optional<String>> male = Optional.of(Optional.of("Male"));
        System.out.println(male.flatMap(s -> s.map(String::toUpperCase)));
        System.out.println(male.map(s -> s.map(String::toUpperCase)));
    }
}
