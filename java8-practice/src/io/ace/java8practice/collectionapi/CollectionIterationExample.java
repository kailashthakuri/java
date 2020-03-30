package io.ace.java8practice.collectionapi;

import io.ace.java8practice.model.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Kailash", "Shahi", 26),
                new Person("Ashok", "Shahi", 27),
                new Person("Dipen", "Bista", 26),
                new Person("Nirajan", "karki", 28));
        /**
         * First Way to iterate over Collection
         * Internal Iterator
         */
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        /**
         * Second Way to iterate over collection objects\
         * External Iterator
         */
        for (Person p : persons) {
            System.out.println(p);
        }
        /**
         *Third Way
         * Here what we are saying is , i don't care about the order just run this for each element.
         */
        persons.forEach(System.out::println);
    }

}
