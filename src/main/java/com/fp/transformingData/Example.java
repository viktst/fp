package com.fp.transformingData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Example {
    static class Person {
        private final String name;
        private final int age;

        public Person(final String theName, final int theAge) {
            name = theName;
            age = theAge;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int ageDifference(final Person other) {
            return age - other.age;
        }

        @Override
        public String toString() {
            return String.format("%s - %d", name, age);
        }
    }

    public static void printPeople(final String message, final List<Person> people) {
        System.out.println(message);
        people.forEach(System.out::println);
        System.out.println();
    }

    public static void main(String[] args) {
        final List<Person> employees = Arrays.asList(
                new Person("Brian", 28),
                new Person("Nate", 32),
                new Person("Neal", 25),
                new Person("Raju", 30),
                new Person("Sara", 27),
                new Person("Scott", 35)
        );

        List<Person> ascendingAge = employees.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .collect(toList());

        employees.stream()
                .min(Comparator.comparingInt(Person::getAge))
                .ifPresent(youngest -> System.out.println(youngest + "\n"));

        List<Person> olderThan30 = employees.stream()
                .filter(p -> p.getAge() > 30)
                .collect(toList());

        List<String> upperNames = employees.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(toList());

        List<Person> skippedFirstTwo = employees.stream()
                .skip(2)
                .collect(toList());

        List<Person> firstThree = employees.stream()
                .limit(3)
                .collect(toList());
    }
}