package com.fp.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Triple<T extends Number> {
    private final T first;
    private final T second;
    private final T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public double max() {
        return Stream.of(first, second, third)
                .mapToDouble(Number::doubleValue)
                .max()
                .orElse(Double.NaN);
    }

    public double average() {
        return Stream.of(first, second, third)
                .mapToDouble(Number::doubleValue)
                .average()
                .orElse(Double.NaN);
    }

    public Triple<T> sort() {
        List<T> sorted = Stream.of(first, second, third)
                .sorted(Comparator.comparingDouble(Number::doubleValue))
                .collect(Collectors.toList());

        return new Triple<>(sorted.get(0), sorted.get(1), sorted.get(2));
    }

    @Override
    public String toString() {
        return String.format("%.2f %.2f %.2f",
                first.doubleValue(),
                second.doubleValue(),
                third.doubleValue());
    }
}