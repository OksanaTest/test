package com.goit.examplesFromShildt.generics.example07;

public class GenInterfaceDemo {
    public static void main(String[] args) {
        Integer inums[] = {23, 56, 23, 2, 23, 6};
        Character chs[] = {'d', 'r', 'i', 'z'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> chob = new MyClass<>(chs);

        System.out.println("Max value in the integer array is: " + iob.max());
        System.out.println("Min value in the integer array is: " + iob.min());
        System.out.println("Max value in the character array is: " + chob.max());
        System.out.println("Min value in the character array is: " + chob.min());
    }
}
