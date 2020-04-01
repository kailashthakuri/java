package io.ace.java9practice;

import java.util.stream.Stream;

public class StreamApiExample {
    public static void main(String[] args) {


        /**
         * iterate method now has hasNext predicate as a parameter which stops the  loop once hasNext returns the false;
         */
        Stream.iterate(0, x -> x < 10, x -> x + 1)
                .forEach(System.out::println);

        /**
         * to prevent the NullPointerException
         */
        long count = Stream.ofNullable(null).count();
        System.out.println(count);

    }
}
