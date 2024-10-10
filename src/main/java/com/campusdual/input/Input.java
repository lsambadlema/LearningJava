package com.campusdual.input;

import com.campusdual.Utils;

import java.util.Scanner;

public class Input {

    public static void useScannerToGetName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi" + name);
    }

    public static void useUtilsToGetName(){
        String name = Utils.string("Write your name: ");
        System.out.println("Hi " + name);
    }
    public static void main(String[] args) {
        //useScannerToGetName();
        useUtilsToGetName();
    }
}

