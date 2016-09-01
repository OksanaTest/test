package com.goit.examplesFromShildt.generics.example05;
/*
p. 414
 */

public class GenMethDemo {
    //определить, содержится ли лбъект в массиве
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //применить метод isIn для целых чисел
        Integer inums[] = {1, 5, 6, 34, 123, -23};
        if (isIn(23, inums)) {
            System.out.println("inums contains 23");
        }else System.out.println("inums does not contain 23");
        if (isIn(123, inums)){
            System.out.println("inums contains -123");
        }
        else System.out.println("inums does not contain -123");
        //for Strings
        String strnums[] = {"test", "frog", "cat", "dog"};
        if (isIn("test", strnums)) {
            System.out.println("srtnum contains test");
        }
        else System.out.println("srtnum does not contain test");
        if (isIn("quaaaa", strnums)){
            System.out.println("srtnum contains quaaaa");
        }
        else System.out.println("srtnum does not contain quaaaa");

        }


}
