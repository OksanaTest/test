package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.interfaces.RemoveMethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class RemoveMethodImplementation implements RemoveMethod{
    @Override
    public void removeMethod(String collectionName, int collectionSize) throws Exception{
        PrintWriter out = new PrintWriter(new BufferedWriter
                (new FileWriter("collectionsTimingParameters.txt", true)));
        switch (collectionName){
            case "ArrayList":
                ArrayListToMeasure arrayListToMeasure = new ArrayListToMeasure();
                List<Double> list = arrayListToMeasure.createCollection(collectionSize);
                removeMethodsForCollection(list);
                out.print(collectionSize);
                break;
            case "HashSet":
                HashSetToMeasure hashSetToMeasure = new HashSetToMeasure();
                Set<Double> hashSet = hashSetToMeasure.createCollection(collectionSize);
                removeMethodsForCollection(hashSet);
                out.print(collectionSize);
                break;
            case "LinkedList":
                LinkedListToMeasure linkedListToMeasure = new LinkedListToMeasure();
                List<Double> linkedList = linkedListToMeasure.createCollection(collectionSize);
                removeMethodsForCollection(linkedList);
                out.print(collectionSize);
                break;
            case ("TreeSet"):{
                TreeSetToMeasure treeSetToMeasure = new TreeSetToMeasure();
                Set<Double> treeSet = treeSetToMeasure.createCollection(collectionSize);
                removeMethodsForCollection(treeSet);
                out.print(collectionSize);
                break;
            }
        }
        out.close();
    }
    private Collection<Double> removeMethodsForCollection (Collection<Double> collection) throws Exception {
        long end, start, time = 0;
        double k, i, j = 0;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("collectionsTimingParameters.txt", true)));
        while (j <= 100) {
            i = (Math.random() * 2000000000) - 10;
            start = System.nanoTime();
            collection.remove(i);
            end = System.nanoTime();
            time += (end - start);
            j++;
        }
        Object toWrite = "\n" + "Remove method for " + collection.getClass().getSimpleName() +
                " time " + time / 100 + ", collection size is " ;
        out.print(toWrite);
        out.close();
        return collection;
    }
}
