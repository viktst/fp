package com.fp.stringComparatorsFilters;

import java.util.Arrays;
import java.util.List;

public class iterateString {
    private static void printChar(int aChar) {
        System.out.println((char)(aChar));
    }

    public static void main(String[] args) {
        final String str = "j4v4";

        // is digit
        str.chars()
                .filter(Character::isDigit)
                .forEach(iterateString::printChar);
    }
}
