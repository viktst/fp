package com.fp.lambda;

import java.util.Arrays;
import java.util.List;

public class multipleStatements {
    static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " - " + age;
        }
    }

    public static void main(String[] args) {
        List<Person> employees = Arrays.asList(
                new Person("Brian", 28),
                new Person("Nate", 32),
                new Person("Neal", 25),
                new Person("Raju", 30),
                new Person("Sara", 27),
                new Person("Scott", 35)
        );

        boolean found = false;
        for (Person p : employees) {
            if (p.getAge() > 30) {
                found = true;
                break;
            }
        }

        employees.forEach(person -> {
            String nameUpper = person.getName().toUpperCase();
            boolean olderThan30 = person.getAge() > 30;
            System.out.println(nameUpper + " is older than 30? " + olderThan30);
        });

        boolean anyOlderThan30 = employees.stream()
                .anyMatch(p -> p.getAge() > 30);
    }
}
