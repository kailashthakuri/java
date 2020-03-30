package io.ace.streamapi;

import io.ace.streamapi.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kailash", "Ashok", "Dipendra", "Nirajan", "Kshitij");

        List<User> users = Arrays.asList(new User("Kailash", "Shahi", 27),
                new User("Ashok", "Shahi", 27),
                new User("Kshitij", "Khanal", 28),
                new User("Nirajan", "Karki", 20));

        names.stream()
                .map(User::new)
                .map(User::getFirstName)
                .forEach(System.out::println);

        List<String> firstNames = names.stream()
                .map(User::new)
                .map(User::getFirstName)
                .collect(Collectors.toList());

        System.out.println(firstNames);

        int sum = users.stream()
                .mapToInt(User::getAge)
                .sum();
        System.out.println(sum);

    }
}
