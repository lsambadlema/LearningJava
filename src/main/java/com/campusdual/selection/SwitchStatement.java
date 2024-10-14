package com.campusdual.selection;

public class SwitchStatement {



    public static int methodSwitchCase(int value){
        int toRet = 0;


        switch (value + 1){
            case 1:
                toRet = value + 1;
                break;
            case 2:
                toRet = value;
                break;
            case 3:
                toRet = value - 1;
                break;
            default:
                toRet = value * 2;
                  break;
        }


        return toRet;
    }


    public static void main(String[] args) {
        int initialValue = 3;
        int value = methodSwitchCase(initialValue);
        System.out.println("Initial Value is -> "+ initialValue + ", final value is ->"+ value );

    }
}

