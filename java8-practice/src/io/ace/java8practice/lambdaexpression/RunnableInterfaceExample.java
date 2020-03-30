package io.ace.java8practice.lambdaexpression;

public class RunnableInterfaceExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Printed Inside Runnable"));
        thread.run();
    }
}
