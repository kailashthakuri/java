package io.ace.java8practice.lambdaexpression;

public class ThisReferenceExample {
    public static void main(String[] args) {
        int value = 10;
        ThisReferenceExample example = new ThisReferenceExample();

        /**
         * Here in the anonymous inner class 'this' refers to the current object of the anonymous inner class.
         * so What about lambda?
         */
        example.doProcess(value, new Process() {
            @Override
            public void process(int i) {
                System.out.println(this);
            }
        });
        example.execute(value);
    }

    public void execute(int value) {
        System.out.println(this);
        doProcess(value, n -> System.out.println(n));
    }

    public void doProcess(int i, Process process) {
        process.process(i);
    }

    interface Process {
        void process(int i);
    }

    @Override
    public String toString() {
        return "This is something";
    }
}
