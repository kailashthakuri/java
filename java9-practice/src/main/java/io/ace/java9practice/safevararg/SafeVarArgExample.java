package io.ace.java9practice.safevararg;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgExample {

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("a", "b", "c");
        List<String> l2 = Arrays.asList("a", "d", "x");
        print(l1, l2);
    }

    @SafeVarargs
    private static void print(List<String>... list) {
        for (List<String> l : list) {
            System.out.println(l);
        }
    }
}
