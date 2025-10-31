package com.fp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Iteration {
    public static void main(String[] args) {
        final List<String> friends =
                Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");

        // Old style:
        // for(int i=0; i < friends.size(); i++){
        //    System.out.println(friends.get(i));
        // }

        // Better way:
        //  for(String name : friends){
        //      System.out.println(name);
        //  }

        //        friends.forEach(new Consumer<String>() { //Verbose, please don't do this
        //            public void accept(final String name) {
        //                System.out.println(name);
        //            }
        //        });

        // forEach, one line
        friends.forEach((String name) -> System.out.println(name));
    }
}
