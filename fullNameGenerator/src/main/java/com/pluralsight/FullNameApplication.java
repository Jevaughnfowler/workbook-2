package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First Name: ");
        String firstname = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middlename = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastname = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        String fullname = "";
        if (middlename.isEmpty()){
            fullname = firstname +" "+ lastname;
        } else{
            fullname = firstname +" "+ middlename +" "+ lastname;
        }


        System.out.println("Full Name " + fullname);



    }
}
