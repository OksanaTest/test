package com.goit.examplesFromShildt.generics.example;
/*
p. 398
 Простой обобщенный класс .
 Здесь Т обозначает параметр типа ,
 который будет заменен реальным типом
 присоздании объекта типа Gen
 */
public class Gen<T> {
    T ob; // declaration T object type

    //pass reference to type T object to constructor
    Gen(T o){
        ob =  o;
    }

    //return object ob
    T getOb(){
        return ob;
    }

    //show type T
    void showType(){
        System.out.println("Type T is " + ob.getClass().getSimpleName());
    }
}
