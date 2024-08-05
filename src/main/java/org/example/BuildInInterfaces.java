package org.example;

import java.util.function.*;

public class BuildInInterfaces {
    public static void main(String[] args) {
        // Predicate
        Predicate<Integer> isPositive = num -> num > 0;
        System.out.println("Is 5 positive? " + isPositive.test(5));

        // Function
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        // Consumer
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);
        printMessage.accept("Hello, World!");

        // Supplier
        Supplier<String> defaultString = () -> "Default String";
        System.out.println("Default: " + defaultString.get());
    }
}
