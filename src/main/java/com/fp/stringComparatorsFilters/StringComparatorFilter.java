package com.fp.stringComparatorsFilters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringComparatorFilter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "avocado", "cherry", "apricot");

        List<String> startsWithA = words.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(startsWithA); // starts with a

        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedWords); // sorted words

        List<String> sortedByLength = words.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());
        System.out.println(sortedByLength); // sorted by length

        List<String> filteredAndSorted = words.stream()
                .filter(s -> s.contains("e"))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(filteredAndSorted); // contains e
    }
}
