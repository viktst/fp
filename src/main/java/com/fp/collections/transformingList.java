package com.fp.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class transformingList {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        final List<String> uppercaseNames = new ArrayList<>();
        for(String name : friends) {
            uppercaseNames.add(name.toUpperCase());
        }

        System.out.println(uppercaseNames);

        // using lambdas:
        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // counting the length of names:
        friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));
    }
}
