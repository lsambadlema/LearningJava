package com.campusdual.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> instrumentsTypes = new HashMap<>();

        instrumentsTypes.put("Guitar", "String");
        instrumentsTypes.put("Piano", "String");
        instrumentsTypes.put("Drums", "Percussion");
        instrumentsTypes.put("Violin", "String");


        System.out.println("Map of musical instruments and types: ");

        for ( Map.Entry <String, String> entry : instrumentsTypes.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        instrumentsTypes.put("Piano", "Percussion");


        System.out.println("Map after modification ");
        for ( Map.Entry <String, String> entry : instrumentsTypes.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Contains specific key");
        System.out.println(instrumentsTypes.containsKey("Piano"));

    }
}
