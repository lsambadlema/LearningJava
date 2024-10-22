package com.campusdual.abstractclass;

public class Fox extends Animal{

    public Fox(String animalName) {
        super(animalName);
    }


    @Override
    public void makeSound() {
        System.out.println("What does the fox say?");

    }
}


