package io.ace.java8practice.optional;

import java.util.Optional;

/**
 * of
 * ofNullable
 */

public class OptionalBasicExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = null;

        Optional<Integer> a1 = Optional.of(a);
        Optional<Integer> b1 = Optional.ofNullable(b);
        add(a1, b1);

        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
    }

    private static void add(Optional<Integer> a1, Optional<Integer> b1) {
        System.out.println(a1.isPresent());
        System.out.println(b1.isPresent());
        Integer a = a1.get();
        // orElse => returns the value if present  otherwise returns the default values.
        Integer b = b1.orElse(2);
        Integer result = a + b;
        System.out.println("Result : " + result);
    }

}
