package com.oozeander.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person(1, "Billel KETROUCI", Gender.MALE),
                new Person(2, "Vinoth VENEDITTAN", Gender.MALE),
                new Person(3, "El Bakay BOURAJOINI", Gender.MALE),
                new Person(4, "Meriem KECHEROUD", Gender.FEMALE)
        );

        // map / mapToInt / mapToDouble ...
        // collect / toList / toSet
        people.stream().map(person -> person.gender).collect(Collectors.toSet())
                .forEach(gender -> System.out.println(gender));
        people.stream().map(person -> person.name).mapToInt(name -> name.length())
                .forEach(System.out::println);
        // collect toMap
        Map<Integer, Person> persons = people.stream().collect(Collectors.toMap(Person::getId, Function.identity()));
        System.out.println(persons);
        // allMatch / anyMatch / noneMatch
        boolean allMales = people.stream().allMatch(person -> person.gender.equals(Gender.MALE));
        System.out.println(allMales);
        // filter
        people.stream().filter(person -> person.gender.equals(Gender.MALE)).forEach(System.out::println);
        // toArray(Person[]::new)
        // findFirst / findAny / count
        // max / min / sorted
        people.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }

    static class Person {
        private final Integer id;
        private final String name;
        private final Gender gender;

        public Person(Integer id, String name, Gender gender) {
            this.id = id;
            this.name = name;
            this.gender = gender;
        }

        public Integer getId() { return this.id; }
        public String getName() { return this.name; }
        public Gender getGender() { return this.gender; }

        @Override
        public String toString() {
            return "Person[name = " + this.name + ", gender = " + this.gender + "]";
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}