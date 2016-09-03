package com.goit.examplesFromShildt.generics.example09;
/*
create type Gen2 object
 */
public class HierDemo {
    public static void main(String[] args) {
        //create type Gen2 objects for integer + strings
        Gen2<String, Integer> x = new Gen2<>("test",45);
        x.getOb();
        System.out.println("should be some integer - " + x.getOb2());
        System.out.println("should be some string - " + x.getOb());
    }
}
