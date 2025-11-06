package com.fp.refactoring;

import java.time.Year;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class LeapYearsUnbounded {
    // imperative style
    public int countFrom1900Imperative(Predicate<Integer> shouldContinue) {
        int numberOfLeapYears = 0;

        for (int i = 1900; ; i += 4) {
            if (!shouldContinue.test(i)) {
                break;
            }

            if (Year.isLeap(i)) {
                numberOfLeapYears++;
            }
        }

        return numberOfLeapYears;
    }

    // fp style
    public int countFrom1900Functional(Predicate<Integer> shouldContinue) {
        return (int) IntStream.iterate(1900, year -> year + 4)
                .takeWhile(shouldContinue::test)
                .filter(Year::isLeap)
                .count();
    }
}
