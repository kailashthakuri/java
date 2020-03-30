package io.ace.java8practice.lambdaexpression.greeting;

/**
 * Way to pass behavior in java
 */
public class GreeterExample {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        // Pass concrete class  that implements Greeting Interface
        greeter.greet(new HelloWorldGreeting());
        // Pass anonymous class that implements Greeting Interface.
        greeter.greet(new Greeting() {
            @Override
            public void perform() {
                System.out.println("This is Nepali Greeting");
            }
        });
        // Using Lambda Expression.
        Greeting myRunnable = () -> System.out.println("This  is Bhutanese Greeting");
        greeter.greet(myRunnable);
    }
}
