package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what is the person full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Whats the person age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("what is your profession: ");
        String profession = scanner.nextLine();

        System.out.printf("Person %s is a %s and is %d years old ", fullName,  profession,age);

        displayPerson(fullName, age, profession);
        savePerson(fullName, age, profession);

    }


    public static void savePerson(String fullName, int age, String profession){


    }
    public static void displayPerson(String fullName, int age, String profession){

    }


}


