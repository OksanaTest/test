package com.goit.examplesFromShildt.generics.example01;
/*
p.430
simple generic class with two parameters: T and V
 */
public class TwoGen<T, V> {
    T ob1;
    V ob2;
    //pass to the constructor type T and V references
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }
    //show types T and V
    void showTypes() {
        System.out.println("type T is " + ob1.getClass().getName());
        System.out.println("type V is " + ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
