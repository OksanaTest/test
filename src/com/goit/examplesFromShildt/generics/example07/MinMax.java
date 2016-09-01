package com.goit.examplesFromShildt.generics.example07;

public interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
