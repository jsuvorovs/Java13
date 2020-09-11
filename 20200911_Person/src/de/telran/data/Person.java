package de.telran.data;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        if(age>0&&age<110) this.age = age;
        else System.out.println("Wrong age value");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
