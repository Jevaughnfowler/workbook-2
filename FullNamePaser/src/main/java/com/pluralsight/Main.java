package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //know values
        System.out.print("What is your full Name ");
        String name = scanner.nextLine().trim();

        //calculate the unknown

        int firstSpaceIndex = name.indexOf(" ");


        String firstName = name.substring(0,firstSpaceIndex);

        int secondSpaceindex = name.indexOf(" ",firstSpaceIndex +1);

        String middleName = "";
        String lastName = "";


        if(secondSpaceindex >=0){
             middleName = name.substring(firstSpaceIndex + 1, secondSpaceindex);
             lastName = name.substring(secondSpaceindex + 1);

        }else{
           middleName = ("none");
           lastName = name.substring(firstSpaceIndex + 1);
        }


        //display the result
        System.out.println();
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
    }
}