package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.createCollections.CreateCollection;
import com.goit.lessons.homeWorkEE.modules01.interfaces.AddMethod;

import java.util.HashSet;
import java.util.Set;

public class HashSetToMeasure implements CreateCollection {
    @Override
    public Set<Double> createCollection (int collectionSize) {
        HashSet<Double> set = new HashSet<>();
        for (int i = 0; i < collectionSize; i++) {
            set.add((Math.random() * 2000000000) - 60);
        }
      return set;
    };
}
