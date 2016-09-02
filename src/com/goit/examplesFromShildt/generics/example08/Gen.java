package com.goit.examplesFromShildt.generics.example08;
/*
p.420
Base type demonstration
 */
public class Gen<T> {
    T ob;
    //pass reference to constructor
    Gen(T o){
        ob = o;
    }
    //return object ob
    T getOb(){
        return ob;
    }
}
