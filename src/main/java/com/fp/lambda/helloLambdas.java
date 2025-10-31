package com.fp.lambda;

import java.util.ArrayList;
import java.util.List;

public class helloLambdas {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("New York");
        cities.add("Washington DC");
        cities.add("Miami");
        cities.add("Chicago");

        //        boolean found = false;
        //        for(String city : cities){
        //            if(city.equals("Chicago")) {
        //                found = true;
        //                break;
        //            }
        //        }
        //
        //        System.out.println("Found chicago?: " + found);

        // Better way:
        System.out.println("Found chicago?: " + cities.contains("Chicago"));
    }
}
