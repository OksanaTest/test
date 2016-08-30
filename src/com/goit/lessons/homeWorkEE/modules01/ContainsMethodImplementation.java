package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.interfaces.ContainsMethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ContainsMethodImplementation implements ContainsMethod {
    @Override
    public void containsMethod(String collectionName, int collectionSize) throws Exception {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("collectionsTimingParameters.txt", true)));
        switch (collectionName) {
            case "ArrayList":
                ArrayListToMeasure arrayListToMeasure = new ArrayListToMeasure();
                List<Double> list = arrayListToMeasure.createCollection(collectionSize);
                containsMethodsForCollection(list);
                out.print(collectionSize);
                break;
            case "HashSet":
                HashSetToMeasure hashSetToMeasure = new HashSetToMeasure();
                Set<Double> hashSet = hashSetToMeasure.createCollection(collectionSize);
                containsMethodsForCollection(hashSet);
                out.print(collectionSize);
                break;
            case "LinkedList":
                LinkedListToMeasure linkedListToMeasure = new LinkedListToMeasure();
                List<Double> linkedList = linkedListToMeasure.createCollection(collectionSize);
                containsMethodsForCollection(linkedList);
                out.print(collectionSize);
                break;
            case ("TreeSet"): {
                TreeSetToMeasure treeSetToMeasure = new TreeSetToMeasure();
                Set<Double> treeSet = treeSetToMeasure.createCollection(collectionSize);
                containsMethodsForCollection(treeSet);
                out.print(collectionSize);
                break;
            }
        }
        out.close();
    }

    private Collection<Double> containsMethodsForCollection (Collection<Double> collection) throws Exception {
        long end, start, time = 0;
        double k, i, j = 0;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("collectionsTimingParameters.txt", true)));
        while (j <= 100) {
            i = (Math.random() * 2000000000) - 10;
            start = System.nanoTime();
            collection.contains(i);
            end = System.nanoTime();
            time += (end - start);
            j++;
        }
        Object toWrite = "\n" + "Contains method for " + collection.getClass().getSimpleName() +
                " time " + time / 100 + ", collection size is " ;
        out.print(toWrite);
        out.close();
        return collection;
    }
}
