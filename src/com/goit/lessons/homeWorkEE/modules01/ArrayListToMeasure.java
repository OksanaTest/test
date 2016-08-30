package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.createCollections.CreateCollection;

import java.util.ArrayList;
import java.util.List;


public class ArrayListToMeasure implements CreateCollection{
    @Override
    public List<Double> createCollection (int collectionSize){
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < collectionSize; i++) {
            list.add((Math.random() * 2000000000) - 60);
        }
        return list;
    }
}

