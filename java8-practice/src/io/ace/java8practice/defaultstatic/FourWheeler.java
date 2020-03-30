package io.ace.java8practice.defaultstatic;

interface FourWheeler {
    default void print() {
        System.out.println("I m FourWheeler");
    }
}
