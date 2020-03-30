package io.ace.java8practice.defaultstatic;

interface Vehicle {
    default void print() {
        System.out.println("I m vehicle.");
    }

    static void blowHorn() {
        System.out.println("Blowing Horm !!!!!!!");
    }
}




