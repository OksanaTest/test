package com.goit.examplesFromShildt.typeCasting;
/*
p.91
 */
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.134;

        System.out.println("Cast int to byte:");
        b = (byte) i;
        System.out.println("i = " + i + " b = " + b);
        System.out.println("\nCast double to int:");
        i = (int) d;
        System.out.println("d = " + d + " i = " + i);
        System.out.println("\nCast double to byte:");
        b = (byte) d;
        System.out.println("d = " + d + " b = " + b);

    }
}
