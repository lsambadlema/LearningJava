package com.campusdual.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {

        Set<String> instruments = new HashSet<>();

        instruments.add("Piano");
        instruments.add("Guitar");
        instruments.add("Piano");
        instruments.add("Drums");
        instruments.add("Bass");
        instruments.add("Drums");
        instruments.add("Piano");
        instruments.add("Drums");

        System.out.println("Set of musical instruments:");
        for (String instrument : instruments) {
            System.out.println(instrument);
        }

        instruments.remove("Drums");
        instruments.add("Flute");


        System.out.println("Set after modification:");
        for (String instrument : instruments) {
            System.out.println(instrument);

        }
    }
}
