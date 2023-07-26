package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.example.JavaFunctional.Gender.FEMALE;
import static org.example.JavaFunctional.Gender.MALE;

public class JavaFunctional {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

//        imperative approach:
        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if(FEMALE.equals(person.gender)){
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);

        }
//    declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
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
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
enum Gender {
    MALE, FEMALE
}
}
