package io.ace.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileExample {
    public static void main(String[] args) {
        try {
            List<String> value = Files.lines(Paths.get("E:\\git\\java\\stream-api\\pom.xml"))
                    .filter(s -> s.contains("artifactId"))
                    .map(s -> {
                        return s.trim().
                                replaceAll("artifactId", "").
                                replaceAll(">", "").
                                replaceAll("/", "").
                                replaceAll("<", "");
                    })
                    .collect(Collectors.toList());

            Stream<String> values = Stream.of("hello", "test");
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
