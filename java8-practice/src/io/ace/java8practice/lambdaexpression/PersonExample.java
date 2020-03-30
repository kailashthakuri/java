package io.ace.java8practice.lambdaexpression;

import io.ace.java8practice.model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonExample {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Kailash", "Shahi", 26),
                new Person("Ashok", "Shahi", 27),
                new Person("Dipen", "Bista", 26),
                new Person("Nirajan", "karki", 28));

        // Sort persons by last name.
        Collections.sort(persons, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        /**
         * printCondition
         */
        // all persons
        System.out.println("------------------------------");
        System.out.println("All Persons");
        printCondition(persons, p -> true);

        // peroons that have last name 'Shahi'
        System.out.println("Persons that have last Name 'Shahi'");
        System.out.println("------------------------------");
        printCondition(persons, p -> p.getLastName().equals("Shahi"));

        // perons that have age greater than 26
        System.out.println("Persons that have age greater than 26");
        System.out.println("------------------------------");
        Predicate<Person> ageGreaterThan26 = p -> p.getAge() > 26;
        printCondition(persons, ageGreaterThan26);

        /**
         * perform method
         */

        // print the first name of person that have last name equals to 'Shahi'
        System.out.println("Firs Name of persons that have last  name equals to 'Shahi'");
        System.out.println("------------------------------");
        perform(persons, p -> p.getLastName().equals("Shahi"), p -> System.out.println(p.getFirstName()));

    }

    public static void printCondition(List<Person> personList, Predicate<Person> predicate) {
        for (Person person : personList) {
            if (predicate.test(person)) {
                System.out.println(person);
            }
        }
    }

    public static void perform(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : personList) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }
    }
}
