package com.goit.examplesFromShildt.generics.example04;

public class Coords<T extends TwoD> {
    T[] coords;
    Coords(T[] o){
        coords = o;
    }
}
