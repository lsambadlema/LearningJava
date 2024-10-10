package com.campusdual.selection;

public class IfStatement {

    public static void methodIf(int value) {
        if (value >= 5) {
            System.out.println("1.- Greater or equal than 5");

        }

    }


        public static void methodIfElse(int value) {
            if (value >= 5) {
                System.out.println("2.- Greater or equal than 5");

            } else {
                System.out.println("2.- Lower or equal than 4");
            }

        }


    public static void methodIfElseIf(int value) {
        if (value >=10) {

            System.out.println("3.- Greater or equal than 10");

        } else if (value <= 5) {
            System.out.println("3.- Lower or equal than 5");
        } else {
            System.out.println("3.- Between 6 and 9");
        }

    }



    public static void main(String[] args) {
        int myNum = 8;


        methodIf(myNum);
        methodIfElse(myNum);
        methodIfElseIf(myNum);

    }
}




