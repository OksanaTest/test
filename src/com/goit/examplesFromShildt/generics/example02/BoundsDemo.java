package com.goit.examplesFromShildt.generics.example02;

public class BoundsDemo {
    public static void main(String[] args) {
        Float inums[] = {1f,2f,3f,4f,5f};
        Stats<Float> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("average value is : " + v);
    }
}
