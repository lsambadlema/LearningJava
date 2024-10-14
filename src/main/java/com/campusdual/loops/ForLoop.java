package com.campusdual.loops;

import com.campusdual.Utils;

public class ForLoop {

    public static void countEvenNumbers(){
       int initial_number = Utils.integer("Write your start number: ");
       int final_number = Utils.integer("Write your final number: ");
       int count = 0;

       for (int i = initial_number; i <= final_number; i++){
           if (i % 2 == 0){
               count++;
           }
       }

        System.out.println("There are "+ count + "even number between "+ initial_number + "and "+final_number);

    }






    public static void main(String[] args) {
        countEvenNumbers();
    }
}
