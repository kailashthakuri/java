package io.ace.java8practice.lambdaexpression;

public class TypeInferenceExample {

    public static void main(String[] args) {
//        MyFunction myFunction = s -> s.length();
//        System.out.println(myFunction.printCondition("Kailash"));
        executeLambda(s -> s.length());
    }

    public static void executeLambda(MyFunction myFunction) {
        System.out.println(myFunction.perform("Kailash"));
    }

    @FunctionalInterface
    interface MyFunction {
        int perform(String s);
    }
}



