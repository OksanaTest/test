package com.goit.examplesFromShildt.generics.example08;

public class RawDemo {
    public static void main(String[] args) {
        //create type Gen object for Integer
        Gen<Integer> iob = new Gen<Integer>(88);
        //create type Gen object for strings
        Gen<String> strob = new Gen<String>("test string");
        //create base type object and assign Double value to it
        Gen raw = new Gen(new Double(34.34));
        //type cast is need because type is indefinite
        double d = (Double) raw.getOb();
        System.out.println("Value : " + d);

    }
}
