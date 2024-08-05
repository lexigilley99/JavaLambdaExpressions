package org.example;

public class SimpleExpressions {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.op(5, 3));

        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.op(5, 3));

        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.op(5, 3));

        MathOperation division = (a, b) -> a / b;
        System.out.println("Division: " + division.op(6, 3));
    }

    interface MathOperation {
        int op(int a, int b);
    }
}
