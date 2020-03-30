package io.ace.java8practice.methodreference;

import io.ace.java8practice.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference2Example {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Kailash", "Shahi", 26),
                new Person("Ashok", "Shahi", 27),
                new Person("Dipen", "Bista", 26),
                new Person("Nirajan", "karki", 28));
        printCondition(persons, p -> p.getLastName().equals("Shahi"), System.out::println);
    }

    public static void printCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if (predicate.test(p)) {
                consumer.accept(p);
            }
        }
    }
}
