package com.pluralsight;

public class Person {

    private String fullName;
    private int age;
    private String profession;


    public Person(String fullName, int age,String profession) {
        this.fullName = fullName;
        this.age = age;
        this.profession = profession;
    }

    //getter and setter

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
