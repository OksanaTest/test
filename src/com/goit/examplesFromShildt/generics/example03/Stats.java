package com.goit.examplesFromShildt.generics.example03;
/*
p.408
meta symbol usage
 */
public class Stats<T extends Number> {
    T[] numbs;
    Stats(T[] o){
        numbs = o;
    }
    double average(){
        double sum = 0.0;
        for (int i = 0; i < numbs.length; i++){
            sum += numbs[i].doubleValue();
        }
        return sum/numbs.length;
    }
    boolean sameAvg(Stats<?> ob){
        if(average() == ob.average()){
           return true;
        }
        else return false;
    }
}
