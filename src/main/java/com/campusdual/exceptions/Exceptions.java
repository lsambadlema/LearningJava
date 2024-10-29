package com.campusdual.exceptions;

public class Exceptions {

    public static int divisionByNumber(int a, int b) throws ByZeroException{
        if (b == 0){
            throw  new ByZeroException( ("Cannot perform a division by 0."));
        }else {
            return a/b;
        }
    }

    public static void main(String[] args) {
        // int dividend = 3, divisor = 0;
        // int res = Exceptions.divisionByNumber(dividend,divisor);
        // System.out.println(res);
        //  String greetigs = "Hello there!";
        // System.out.println(Integer.parseInt(greetigs));

        int dividend = 3, divisor = 0;

        try {
            int res = Exceptions.divisionByNumber(dividend, divisor);
        } catch (ArithmeticException e) {
            System.err.println("Program failed." + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Program finished.");
        }

    }
    }

