package com.goit.examplesFromShildt.generics.example01;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Some message");
        tgObj.showTypes();
        int t = tgObj.getOb1();
        System.out.println("value T is " + t);

        String v = tgObj.getOb2();
        System.out.println("value V is " + v);
    }
}
