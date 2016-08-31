package com.goit.examplesFromShildt.generics.example03;

public class WildCardDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println("average value iob is " + v);

        Double dnums[] = {2.5, 1.8, 3.8};
        Stats<Double> dob = new Stats<>(dnums);
        double d = dob.average();
        System.out.println("average value dob is " + d);

        Float fnums[] = {1f, 2f, 3f, 4f, 5f};
        Stats<Float> fob = new Stats<>(fnums);
        double f = fob.average();
        System.out.println("average value fob is " + f);

        if (iob.sameAvg(fob)){
            System.out.println("average values iob and fob are equal");
        }
        else System.out.println("average values iob and fob are not equal");
        if (iob.sameAvg(dob)){
            System.out.println("average values iob and dob are equal");
        }
        else System.out.println("average values iob and fob are not equal");
        if (fob.sameAvg(dob)){
            System.out.println("average values dob and fob are equal");
        }
        else System.out.println("average values dob and fob are not equal");
    }
}
