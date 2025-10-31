package com.fp.collections;

import java.util.Arrays;
import java.util.List;

public class findingElements {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        // Old Way:
        // final List<String> startsWithN = new ArrayList<>();
        //     for(String name : friends) {
        //         if(name.startsWith("N")) {
        //              startsWithN.add(name);
        //         }
        //     }

       // Better way:
        final List<String> startsWithN =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .toList();

        System.out.printf("Found %d names%n", startsWithN.size());
    }
}
