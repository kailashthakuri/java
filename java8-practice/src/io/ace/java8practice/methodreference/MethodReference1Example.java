package io.ace.java8practice.methodreference;

public class MethodReference1Example {

    public static void main(String[] args) {

        /**
         * Here lambda expression doing nothing . it is just calling the existing method.
         */
        Thread thread = new Thread(() -> printMessage());

        Thread thread1 = new Thread(MethodReference1Example::printMessage);

        thread.start();
        thread1.start();
    }

    static void printMessage() {
        //  System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println("Hello");
    }

}
