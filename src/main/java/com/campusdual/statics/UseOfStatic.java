package com.campusdual.statics;

public class UseOfStatic {
    public static void main(String[] args) {
        System.out.println("Static Method: ");
        System.out.println("=======");
        System.out.println(StaticMethod.countDownToYear("Lorena", 2222));
        System.out.println(StaticMethod.countDownToYear("Lorena", 1990));
        System.out.println("Static Attribute: ");
        System.out.println("================");
        StaticAttribute sta1 = new StaticAttribute();
        StaticAttribute sta2 = new StaticAttribute();
        StaticAttribute sta3 = new StaticAttribute();

        sta1.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta3.incrementAndPrintCounter();
        sta1.incrementAndPrintCounter();
        sta2.incrementAndPrintCounter();











    }
}
