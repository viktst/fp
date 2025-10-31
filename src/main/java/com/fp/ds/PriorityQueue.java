package com.fp.ds;

import java.util.List;
import java.util.stream.Collectors;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>(java.util.Comparator.naturalOrder());
        pq.add(5);
        pq.add(1);
        pq.add(8);
        pq.add(3);

        List<Integer> multiplied = pq.stream()
                .map(n -> n * 10)
                .collect(Collectors.toList());

        List<Integer> greaterThanFour = pq.stream()
                .filter(n -> n > 4)
                .collect(Collectors.toList());
    }
}