package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.interfaces.AddMethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AddMethodImplementation implements AddMethod{
    @Override
    public void addMethod(String collectionName, int collectionSize) throws Exception{
        PrintWriter out = new PrintWriter(new BufferedWriter
                (new FileWriter("collectionsTimingParameters.txt", true)));
        switch (collectionName){
            case "ArrayList":
                ArrayListToMeasure arrayListToMeasure = new ArrayListToMeasure();
                List<Double> list = arrayListToMeasure.createCollection(collectionSize);
                addMethod(list);
                out.print(collectionSize);
                break;
            case "HashSet":
                HashSetToMeasure hashSetToMeasure = new HashSetToMeasure();
                Set<Double> hashSet = hashSetToMeasure.createCollection(collectionSize);
                addMethodsForSet(hashSet);
                out.print(collectionSize);
                break;
            case "LinkedList":
                LinkedListToMeasure linkedListToMeasure = new LinkedListToMeasure();
                List<Double> linkedList = linkedListToMeasure.createCollection(collectionSize);
                addMethod(linkedList);
                out.print(collectionSize);
                break;
            case ("TreeSet"):{
                TreeSetToMeasure treeSetToMeasure = new TreeSetToMeasure();
                Set<Double> treeSet = treeSetToMeasure.createCollection(collectionSize);
                addMethodsForSet(treeSet);
                out.print(collectionSize);
                break;
            }
        }
        out.close();
    }
     private List<Double> addMethod(List<Double> list) throws Exception{
        long end,start,time = 0 ;
        double k,i,j = 0;
        PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("collectionsTimingParameters.txt", true)));
        while(j <= 100) {
            i = (Math.random() * 2000) - 10;
            k = ( Math.random() * 2000);
            start = System.nanoTime();
            list.add((int)k,i);
            end = System.nanoTime();
            time += (end - start);
            j++;
        }
        Object toWrite = "\n" + "Add (index) method for " + list.getClass().getSimpleName() +
                " time " + time/100 + ", collection size is ";
        out.print(toWrite);
         out.close();
        return list;
    }
    private Set<Double> addMethodsForSet(Set<Double> set) throws Exception{
        long end,start,time = 0 ;
        double i,j = 0;
        PrintWriter out = new PrintWriter(new BufferedWriter(
                new FileWriter("collectionsTimingParameters.txt", true)));
        while(j <= 100) {
            i = (Math.random() * 2000);
            start = System.nanoTime();
            set.add(i);
            end = System.nanoTime();
            time += (end - start);
            j++;
        }
        Object toWrite = "\n" + "Add (value) method for " + set.getClass().getSimpleName() +
                " time " + time/100 + ", collection size is ";
        out.print(toWrite);
        out.close();
        return set;
    }

}
