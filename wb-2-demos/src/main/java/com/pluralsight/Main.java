package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String welcome = "Big tex says\"Howdy\"!";

        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split("\\|");
        // cities is an array containing 3 strings
        // [0] is Dallas, [1] is Ft. Worth, [2] is Auston

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
    }
}