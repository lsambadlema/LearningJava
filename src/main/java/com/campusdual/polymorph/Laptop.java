package com.campusdual.polymorph;

public class Laptop extends Device implements IChargeable{
    public Laptop(String brand, String model) {
        super(brand, model);
    }

    public void behaviourOnCloseScreen(){
        System.out.println("Close screen, preventing power-saving mode");
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " is charging at 65 W.");   //getbrand pq e private se fose public this.brand

    }

    @Override
    public void use() {
        System.out.println("Using whit keyboard and mouse.");

    }
}
