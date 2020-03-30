package io.ace.java8practice.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> even = n -> n % 2 == 0;
        Predicate<Integer> odd = n -> n % 2 != 0;

        System.out.println("Even Output : ");
        evaluate(array, even);
        System.out.println("Odd Output : ");
        evaluate(array, odd);
        System.out.println("Greater  Than Five");
        evaluate(array, n -> n > 5);
    }


    private static void evaluate(List<Integer> values, Predicate<Integer> predicate) {
        for (Integer value : values) {
            if (predicate.test(value)) {
                System.out.println("Passed : " + value);
            }
        }
    }
}
