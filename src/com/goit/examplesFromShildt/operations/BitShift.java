package com.goit.examplesFromShildt.operations;

import com.goit.examplesFromShildt.streams.ByteArrayInputStreamUsage;

/*
p.112
 */
public class BitShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("binary presentation of a " + Integer.toString(a,2) + "\n");
        System.out.println("initial value a: " + a);
        System.out.println("binary presentation of i " + Integer.toString(i, 2));
        System.out.println("i is: " + i + "\n" + "b is: " + b);
    }
}
