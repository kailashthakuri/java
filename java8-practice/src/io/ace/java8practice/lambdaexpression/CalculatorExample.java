package io.ace.java8practice.lambdaexpression;

public class CalculatorExample {

    public static void main(String[] args) {
        CalculatorExample example = new CalculatorExample();
        MathOperation addOperation = (int a, int b) -> a + b;
        MathOperation subOperation = (int a, int b) -> a - b;
        MathOperation multiplyOperation = (int a, int b) -> a * b;
        MathOperation divideOperation = (int a, int b) -> a / b;

        // BiFunction<Integer,Integer,Integer>
        // BinaryOperation<Integer>
        //

        System.out.println(example.operate(10, 20, addOperation));
        System.out.println(example.operate(10, 5, subOperation));
        System.out.println(example.operate(2, 6, multiplyOperation));
        System.out.println(example.operate(50, 10, divideOperation));
    }


    @FunctionalInterface
    interface MathOperation {
        int operation(int num1, int num2);
    }

    public int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
