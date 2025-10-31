package com.fp.ds;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class Stack {

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        List<Integer> squared = stack.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = stack.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }
}