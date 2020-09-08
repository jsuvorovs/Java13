package de.telran.data;

import java.util.Arrays;
import java.util.Scanner;

public class FindNameInArray {

    public static void findName(String[] array) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter name to find in array: ");
        name = scanner.nextLine();
        if (Arrays.asList(array).contains(name)) {
            System.out.println("Welcome, " + name);
        } else {
            System.out.println("Error! Name not found in array");
        }
    }
}