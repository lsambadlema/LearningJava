package com.campusdual.polymorph;

public class Smartphone extends Device implements IChargeable{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    public void makeACall(){
        System.out.println("Making a call.");
    }

    @Override
    public void charge() {
        System.out.println(this.getBrand() + " " + this.getModel() + " is charging at 15 W.");   //getbrand pq e private se fose public this.brand

    }

    @Override
    public void use() {
        System.out.println("Using whit touch screen.");

    }

}
