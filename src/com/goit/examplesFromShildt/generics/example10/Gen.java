package com.goit.examplesFromShildt.generics.example10;
/*
generic subclass inherit non generic class
 */
public class Gen<T> extends NonGen{
    T ob; //declare type T object
    Gen (int i, T o){
        super(i);
        ob = o;
    }
    //return object ob
    T getOb(){
        return ob;
    }
}
