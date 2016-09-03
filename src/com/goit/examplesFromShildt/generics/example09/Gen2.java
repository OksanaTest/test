package com.goit.examplesFromShildt.generics.example09;
/*
subclass, inherits Gen class, defined second parameter V
 */
public class Gen2<T ,V> extends Gen<T> {
    V ob2;
    Gen2(T o, V o2){
        super(o);
        ob2 = o2;
    }
    V getOb2(){
        return ob2;
    }
}
