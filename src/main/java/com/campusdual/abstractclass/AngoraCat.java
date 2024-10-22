package com.campusdual.abstractclass;

public class AngoraCat extends Cat {
    public AngoraCat(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meow! in Angora dialect");
    }


    @Override
    public void climbing() {
        super.climbing();
        System.out.println("Get out of there");
    }
}
