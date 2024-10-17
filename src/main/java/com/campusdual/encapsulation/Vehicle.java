package com.campusdual.encapsulation;

public class Vehicle {
    //Definimos atributos, como : marca, modelo, matricula, disponibilidad para alquilar y velocidad maxima legal

    private String brand;
    private String licensePlate;
    private String model;
    private boolean available;
    private static final int LEGAL_MAX_SPEED = 120;

    public Vehicle(String model, String licensePlate, String brand) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.available = true;
    }

    public String getLicensePlate(){
        return this.licensePlate;

    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentACar() {
        if (this.available) {     //dase por suposto que this.available == true, para que se pode rentACar
            this.available = false;
            System.out.println("The vehicle with license plate: " + this.licensePlate + " has been rented ");   //pódese facer con this.getLicensePlate pero como this.license plate é público pódese poñer directamente
        } else {
            System.out.println("The vehicle with license plate: " + this.licensePlate + " is not available ");

        }
    }


    public void returnACar(){
        if (!this.available) {    //e o mismo que poñer if (this.available) == false
            this.available = true;
            System.out.println("The vehicle with license plate: " + this.licensePlate + " has been returned ");   //pódese facer con this.getLicensePlate pero como this.license plate é público pódese poñer directamente
        } else {
            System.out.println("The vehicle with license plate: " + this.licensePlate + " is already available ");

        }
    }

    public String getDetails() {
        return this.getBrand() + " " + this.getModel() + "\n\tlicense plate: " + this.getLicensePlate() + "\n\tAvailable: " + (this.available ? "Yes" : "No") ;
    }


    public static void main(String[] args) {
        Vehicle v = new Vehicle("Xsara", "0000BBB", "Peugeot");
        System.out.println(v.getDetails());
        v.rentACar();
        System.out.println(v.getDetails());
        v.returnACar();
        System.out.println(v.getDetails());

    }


}
