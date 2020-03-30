package io.ace.java8practice.lambdaexpression;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int key = 0;
//        process(numbers, key, (n, k) -> System.out.println(n / k));

        /**
         * Second  Way
         * Here the one who is passing connsumer is handling exception.
         */
        try {
            process1(numbers, key, (n, k) -> System.out.println(n / k));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        process1(numbers, key, biConsumerWrapper((n, k) -> System.out.println(n / k)));
    }

    /**
     * First Way
     * This is one way to handle exception.
     * But instead of doing this it will better if the one whoever is  passing consumer to  handle that exception.
     */
    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int n : numbers) {
            try {
                consumer.accept(n, key);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void process1(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int n : numbers) {
            consumer.accept(n, key);
        }
    }

    /**
     * Third Way
     * Externalize the try catch block.
     * Wrap the lambda with another lambda
     */
    public static BiConsumer<Integer, Integer> biConsumerWrapper(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }

}
