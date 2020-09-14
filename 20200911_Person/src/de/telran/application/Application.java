package de.telran.application;

import de.telran.data.Person;

import java.util.Arrays;

import static de.telran.data.Person.*;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("Jevgenijs", 13, 183);
        Person person2 = new Person("Vyacheslavs", 31, 185);
        Person person3 = new Person("Ilja", 47, 168);
        Person[] persons = {person1, person2, person3};
        System.out.println(getOldestPerson(persons));
        System.out.println(getYoungestPerson(persons));
        System.out.println(getLongestNamePerson(persons));
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));
    }
}
