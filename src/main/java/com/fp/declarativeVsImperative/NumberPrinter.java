package com.fp.declarativeVsImperative;

import java.util.Arrays;
import java.util.List;

public class NumberPrinter {

    public static void declarativePrint(List<Integer> numbers) {
        assert numbers != null && !numbers.isEmpty() : "List must not be empty";
        numbers.stream()
                .forEach(n -> System.out.print(n + " "));
    }

    public static void imperativePrint(List<Integer> numbers) {
        assert numbers != null && !numbers.isEmpty() : "List must not be empty";
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

        imperativePrint(numbers);
        
        System.out.println();

        declarativePrint(numbers);
    }
}
