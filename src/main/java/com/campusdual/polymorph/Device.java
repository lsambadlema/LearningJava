package com.campusdual.polymorph;

public class Device {

    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void turnOn(){
        System.out.println(this.brand + " " + this.model + " is turned on.");

    }

    public void turnOff(){
        System.out.println(this.brand + " " + this.model + " is turned on.");

    }
}
