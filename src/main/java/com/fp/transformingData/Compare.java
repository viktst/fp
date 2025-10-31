package com.fp.transformingData;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Compare {
    public static void printPeople(final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
    }

    public static void main(String[] args) {
        final List<Person> people = Arrays.asList(new Person("John", 20), new Person("Sara", 21), new Person("Jane", 21), new Person("Greg", 35));

        List<Person> ascendingAge = people.stream().sorted((person1, person2) -> person1.ageDifference(person2)).collect(toList());
        printPeople("Sorted in ascending order by age: ", ascendingAge);

        people.stream()
                .min(Person::ageDifference)
                .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
    }
}
