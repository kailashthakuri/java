package io.ace.streamapi.model;

import java.util.List;

public class Person {
    String firstName;
    String lastName;
    int age;
    List<Integer> phoneNumbers;

    public Person(String firstName, String lastName, int age, List<Integer> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
