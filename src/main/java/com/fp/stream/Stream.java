package com.fp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> words = Arrays.asList("apple","banana","pear","avocado");
        List<Double> decimals = Arrays.asList(1.5, 2.3, 3.7, 4.0, 5.2);

        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, Integer::sum);

        List<String> result = words.stream()
                .filter(s -> s.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        List<Double> processedDecimals = decimals.stream()
                .filter(d -> d > 3)
                .map(d -> d * 10)
                .collect(Collectors.toList());

        System.out.println(sum);
        System.out.println(result);
        System.out.println(processedDecimals);
    }
}
