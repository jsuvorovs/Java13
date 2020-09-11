package de.telran.application;

import de.telran.data.Person;

import static de.telran.data.Person.*;

public class Application {
    public static void main(String[] args) {
        Person person1 = new Person("Jevgenijs", 13);
        Person person2 = new Person("Vyacheslavs", 31);
        Person person3 = new Person("Ilja", 47);
        Person[] persons = {person1, person2, person3};
        System.out.println(getOldestPerson(persons));
        System.out.println(getYoungestPerson(persons));
        System.out.println(getLongestNamePerson(persons));
    }
}
