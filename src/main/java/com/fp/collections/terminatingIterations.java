package com.fp.collections;

import java.util.Arrays;
import java.util.List;

public class terminatingIterations {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        friends.stream()
                .limit(3)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        friends.stream()
                .takeWhile(name -> name.length() > 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
