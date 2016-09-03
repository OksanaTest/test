package com.goit.examplesFromShildt.generics.example09;
/*
p.423
inherits generic class and put into subclass some another type also
 */
public class Gen<T> {
    T ob;
    Gen(T o){
        ob = o;
    }
    //return ob reference
    T getOb(){
        return ob;
    }

}
