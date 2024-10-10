package com.campusdual.methods;

public class Method {


    public static int arithmeticOperators(){

        int value = 5;
        value = value + 3;
        value = 2 - value;
        value += 3;
        value -= 1;
        value *= 4;
        value = (value - 2) / 2;
        int newValue = 3;
        int myValue = 2;
        value = newValue + myValue;
        final int CONST = 2;
        value = CONST;
        value +=3;
        value = value % 2;
        value++;
        value--;
        return value;
    }

    public static void logicOperators() {
        System.out.println("4 is equal to 4:" + (4==4));
        System.out.println("3 is different from 4:" + (3!=4));
        System.out.println("3 is greater from 5:" + (3>5));
        System.out.println("5 is less or equal from 5:" + (5<=5));
        System.out.println("Unique true combination for AND: " + (true && true));
        System.out.println("Unique false combination for OR: " + (false || false));
        System.out.println("NOT false: " + (!false));
    }

    public static String myCustomMessage(String customName){
            return "Hi " + customName + " ! This is your custom message";
    }

    public static void main(String[] args) {
        logicOperators();
        int arithResult = arithmeticOperators() ;
        System.out.println("Arithmetic result: " + arithResult);
        String name = "Lorena";
        String message = myCustomMessage(name);
        System.out.println(message);
        System.out.println(myCustomMessage("Lorena"));
    }
}
