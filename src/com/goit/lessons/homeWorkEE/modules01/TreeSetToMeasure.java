package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.createCollections.CreateCollection;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetToMeasure implements CreateCollection {
    @Override
    public TreeSet<Double> createCollection (int collectionSize){
        TreeSet<Double> treeSet = new TreeSet<>();
        for (int i = 0; i < collectionSize; i++) {
            treeSet.add((Math.random() * 2000000000) - 60);
        }
        return treeSet;
    }
}
