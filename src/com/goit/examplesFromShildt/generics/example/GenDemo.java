package com.goit.examplesFromShildt.generics.example;

public class GenDemo {
    public static void main(String[] args) {
        //create reference type T for integers
        Gen<Integer> iOb;
        //create type Gen<Integer> object and assign reference to this object variable iOb;
        //pay attention to autoboxing using for value 88 incapsulation in the type Integer object
        iOb = new Gen<Integer>(98);
        //show variable iOb data type
        iOb.showType();
        //receive variable iOb value. for this action type cast is not necessary
        int v = iOb.getOb();
        System.out.println("Value: " + v + "\n");
        //create type Gen object for char strings
        Gen<String> strOb = new Gen<String>("text message");
        //show variable iOb data type
        strOb.showType();
        //receive variable iOb value. for this action type cast is not necessary
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}
