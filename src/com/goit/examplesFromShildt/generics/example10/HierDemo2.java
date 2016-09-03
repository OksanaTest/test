package com.goit.examplesFromShildt.generics.example10;
/*
create type Gen object
 */
public class HierDemo2 {
    public static void main(String[] args) {
        Gen<String> stringGen = new Gen<>(786,"test");
        System.out.println(stringGen.getNum());
        System.out.println(stringGen.getOb());
    }
}
