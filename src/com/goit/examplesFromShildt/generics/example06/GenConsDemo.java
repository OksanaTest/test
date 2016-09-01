package com.goit.examplesFromShildt.generics.example06;

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test1 = new GenCons(34f);

        test.showval();
        test1.showval();
    }
}
