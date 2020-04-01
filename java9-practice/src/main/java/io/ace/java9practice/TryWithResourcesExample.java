package io.ace.java9practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        System.out.println(readData("kailash"));
    }

    private static String readData(String input) {
        Reader reader = new StringReader(input);
        BufferedReader bufferedReader = new BufferedReader(reader);
        try (bufferedReader) {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
