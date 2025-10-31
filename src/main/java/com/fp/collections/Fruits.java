package com.fp.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pear");
        fruits.add("avocado");
        fruits.add("cherry");
        fruits.add("apricot");

        fruits.stream()
                .skip(2)
                .forEach(System.out::println);

        fruits.stream()
                .filter(f -> f.startsWith("a"))
                .findFirst()
                .ifPresent(System.out::println);

        List<String> upperFruits = fruits.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        upperFruits.forEach(System.out::println);

        List<String> filtered = fruits.stream()
                .filter(f -> f.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        filtered.forEach(System.out::println);
    }
}