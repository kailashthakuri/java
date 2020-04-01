package io.ace.java9practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableExample {
    public static void main(String[] args) {

        /**
         * prior to java 9 => way to create unmodifiable collection
         */
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> unmodifableList = Collections.unmodifiableList(list);
        System.out.println(unmodifableList);


        /**
         * java 9 version
         */
        List<String> newList = List.of("A", "B", "C");
        System.out.println(newList);
    }
}
