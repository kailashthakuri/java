package io.ace.streamapi;

import io.ace.streamapi.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlagMapExxample {

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(new Person("Kaillash", "Shahi", 27, Arrays.asList(1, 2)),
                new Person("Ashok", "Shahi", 20, Arrays.asList(3, 4)),
                new Person("Nirajan", "Kari", 34, Arrays.asList(5, 6)));
        Optional<Integer> number = persons.stream()
                .map(person -> person.getPhoneNumbers().stream())
                .flatMap(integerStream -> integerStream.filter(num -> num > 1))
                .findAny();
        number.ifPresent(System.out::println);
    }

}
