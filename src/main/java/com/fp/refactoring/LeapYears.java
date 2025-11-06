package com.fp.refactoring;

import java.time.Year;
import java.util.stream.IntStream;

public class LeapYears {
    // imperative style
    public int countFrom1900Imperative(int upTo) {
        int numberOfLeapYears = 0;  // mutable var for counting

        for (int i = 1900; i <= upTo; i += 4) {
            if (Year.isLeap(i)) {
                numberOfLeapYears++;
            }
        }

        return numberOfLeapYears;
    }

    // fp style
    public int countFrom1900Functional(int upTo) {
        return (int) IntStream.iterate(
                        1900,
                        year -> year <= upTo,
                        year -> year + 4)
                .filter(Year::isLeap)
                .count();

        // iterate() creates a stream that generates years until the condition in the predicate is met
    }
}
