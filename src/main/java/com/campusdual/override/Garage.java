package com.campusdual.override;

public class Garage {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        Tractor t = new Tractor();

        v.start();
        c.start();
        t.start();
    }
}
