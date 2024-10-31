package com.campusdual.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JsonFileCreator {

    private static void CreateFile() {
        JsonObject computer = new JsonObject();
        JsonArray componentsArray = new JsonArray();
        componentsArray.add(createItem(2,"Graphic card"));
        componentsArray.add(createItem(1,"CPU"));
        componentsArray.add(createItem(3,"Fan"));
        componentsArray.add(createItem(1,"Motherboard"));
        componentsArray.add(createItem(2,"RAM"));
        componentsArray.add(createItem(2,"SSD"));
        componentsArray.add(createItem(1,"Power supply"));
        componentsArray.add(createItem(1,"Computer case"));
        computer.add("components", componentsArray);

        try(FileWriter fw = new FileWriter("src/main/resources(computerList.json")) {
            //without format
            //====
           // fw.write(computer.toString());

            //whit format
            //====
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(computer);
            fw.write(json);

            //====
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static JsonObject createItem(int quantity, String itemDesc){
        JsonObject component = new JsonObject();
        component.addProperty("quantity", quantity);
        component.addProperty("text", itemDesc);
        return component;
    }


    public static void main(String[] args) {
        JsonFileCreator.CreateFile();

    }
}
