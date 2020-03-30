package io.ace.java8practice.lambdaexpression;

public class ClosureExample {
    public static void main(String[] args) {
        int value = 10;
        int a = 5;
        /**
         * closure concept is application in lambda expression as well as in anonymous inner class.
         * JVM keeps the track of variable used in lambda expression.
         */
        doProcess(value, new Process() {
            @Override
            public void process(int i) {
                System.out.println(i + a);
            }
        });
        doProcess(value, (n) -> System.out.println(n + a));
    }

    public static void doProcess(int value, Process process) {
        process.process(value);
    }


    interface Process {
        void process(int i);
    }


}


