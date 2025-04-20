package com.pluralsight;

import java.util.Scanner;

public class CellphoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("Serial Number: ");

        phone.setSerialNumber(Integer.parseInt((scanner.nextLine())));

        System.out.println("Model :");
        phone.setModel(scanner.nextLine());

        System.out.println("carrier: ");
        phone.setCarrier(scanner.nextLine());

        System.out.println("phonenumber: ");
        phone.setPhoneNumber(scanner.nextLine());
        System.out.println("owner: ");
        phone.setOwner(scanner.nextLine());

        System.out.println("\n--- Phone Info ---");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());

        System.out.println("\n--- Dialing ---");
        phone.dial("212-555-9990");
        phone.dial("666-000-5555");
    }
}