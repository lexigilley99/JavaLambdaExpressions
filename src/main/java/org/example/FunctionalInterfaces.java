package org.example;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // functional interface for string concatenation
        StringOperation world = (s1, s2) -> s1 + s2;
        System.out.println("Concatenation: " + world.operate("Hello, ", "World!"));

        // functional interface for the reverse of the string
        StringOperation reverse = (s1, s2) -> new StringBuilder(s1 + s2).reverse().toString();
        System.out.println("Reversal: " + reverse.operate("Hello", " World"));
    }

    @FunctionalInterface
    interface StringOperation {
        String operate(String s1, String s2);
    }
}
