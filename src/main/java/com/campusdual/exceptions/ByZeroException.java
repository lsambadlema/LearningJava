package com.campusdual.exceptions;

public class ByZeroException extends ArithmeticException{

    public ByZeroException() {
    }

    public ByZeroException(String s) {
        super(s);
    }
}
