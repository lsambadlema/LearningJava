package com.campusdual.abstractclass;

public class Cat extends Animal{

    public Cat(String animalName) {
        super(animalName);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");

    }

   public void climbing() {
       System.out.println("Sooo cute *.*");
   }
}
