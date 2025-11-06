package com.fp.lambda;

import java.util.Arrays;
import java.util.List;

public class multilineLambdas {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        // for(String name : friends) {
        //     String upper = name.toUpperCase();
        //     System.out.println(upper);
        // }

        // using a multiline lambda:
        friends.forEach(name -> {
            String upper = name.toUpperCase();
            int length = name.length();
            System.out.println(upper + " (" + length + " letters)");
        });
    }
}
