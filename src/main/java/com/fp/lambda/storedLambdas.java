package com.fp.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class storedLambdas {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        // ex 1: store a lambda expression that converts a name to uppercase
        Function<String, String> upperCaseName = name -> name.toUpperCase();

        // ex 2: store a predicate that checks if a name starts with 'N'
        Predicate<String> startsWithN = name -> name.startsWith("N");

        // use the stored lambdas
        friends.stream()
                .filter(startsWithN)
                .map(upperCaseName)
                .forEach(System.out::println);

    }
}
