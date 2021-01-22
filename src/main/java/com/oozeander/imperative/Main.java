package com.oozeander.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Billel KETROUCI", Gender.MALE),
                new Person("El Bakay BOURAJOINI", Gender.MALE),
                new Person("Meriem KECHEROUD", Gender.FEMALE),
                new Person("Vinoth VENEDITTAN", Gender.MALE)
        );

        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        System.out.println(females);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person[name = " + this.name + ", gender = " + this.gender + "]";
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}