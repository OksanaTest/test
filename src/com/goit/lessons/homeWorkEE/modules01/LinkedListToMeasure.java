package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.createCollections.CreateCollection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListToMeasure implements CreateCollection{
    @Override
    public List<Double> createCollection (int collectionSize){
        List<Double> linkedList = new LinkedList<>();
        for (int i = 0; i < collectionSize; i++) {
            linkedList.add((Math.random() * 2000000000) - 60);
        }
        return linkedList;
    }
}
