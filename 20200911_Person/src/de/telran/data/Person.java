package de.telran.data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static Person getOldestPerson(Person[] persons) {
        return Arrays.stream(persons)
                .max(Comparator.comparing(Person::getAge))
                .get();
    }
    public static Person getYoungestPerson(Person[] persons) {
        return Arrays.stream(persons)
                .min(Comparator.comparing(Person::getAge))
                .get();
    }
    public static Person getLongestNamePerson(Person[] persons) {
        return Arrays.stream(persons)
                .max(Comparator.comparing(person -> person.name.length()))
                .get();
    }

    @Override
    public int compareTo(Person o) {
        if(this.height != o.getHeight()) {
            return this.height - o.getHeight();
        }
        return this.name.compareTo(o.getName());
    }
}
