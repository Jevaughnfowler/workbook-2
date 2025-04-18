package com.pluralsight;

public class CellPhone {
  private int serialNumber;
  private String phoneNumber;
  private String Model;
  private String carrier;
  private String owner;



  public CellPhone() {
      this.serialNumber = 0;
      this.Model = "";
      this.carrier = "";
      this.phoneNumber = "";
      this.owner = "";

  }

    //getter and setter

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
        return Model;
    }

    public void setModel(String model) {
        Model = model;
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
