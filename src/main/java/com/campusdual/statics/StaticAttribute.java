package com.campusdual.statics;

public class StaticAttribute {
    public static int totalCounter= 0;

    public void incrementAndPrintCounter() {
        StaticAttribute.totalCounter++;
        System.out.println("Counter: " + StaticAttribute.totalCounter);
    }

}

