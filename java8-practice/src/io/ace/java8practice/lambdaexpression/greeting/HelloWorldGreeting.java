package io.ace.java8practice.lambdaexpression.greeting;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello World  Greeting");
    }
}
