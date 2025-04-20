package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String phoneNumber;
    private String model;
    private String carrier;
    private String owner;

    // Default constructor
    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    // Dialing a number directly
    public void dial(String phoneNumber) {
        System.out.printf("%s's Cell phone is dialing the number %s from the number %s\n",
                this.owner, phoneNumber, this.phoneNumber);
    }

    // Dialing another CellPhone
    public void dial(CellPhone phone) {
        System.out.printf("%s's Cell phone is dialing the number %s from the number %s\n",
                this.owner, phone.getPhoneNumber(), this.phoneNumber);
    }

    // Getters and Setters
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}