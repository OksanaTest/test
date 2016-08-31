package com.goit.examplesFromShildt.generics.example02;
/*
p.406
T must be Number class or inherit this class
 */
public class Stats<T extends Number> {
    T[] nums; //class T or its subclasses array
    //pass to the constructor refence to the array elements Number class or its subclasses
    Stats(T[] o){
        nums = o;
    }
    double average(){
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
}
