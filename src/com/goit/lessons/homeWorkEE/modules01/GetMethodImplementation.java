package com.goit.lessons.homeWorkEE.modules01;

import com.goit.lessons.homeWorkEE.modules01.interfaces.GetMethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class GetMethodImplementation implements GetMethod{
    @Override
    public void getByIndexMethod(String collectionName, int collectionSize)throws Exception{
        PrintWriter out = new PrintWriter(new BufferedWriter
                (new FileWriter("collectionsTimingParameters.txt", true)));
        switch (collectionName){
            case "ArrayList":
                ArrayListToMeasure arrayListToMeasure = new ArrayListToMeasure();
                List<Double> list = arrayListToMeasure.createCollection(collectionSize);
                getMethod(list);
                out.print(collectionSize);
                break;
            case "LinkedList":
                LinkedListToMeasure linkedListToMeasure = new LinkedListToMeasure();
                List<Double> linkedList = linkedListToMeasure.createCollection(collectionSize);
                getMethod(linkedList);
                out.print(collectionSize);
                break;
        }
        out.close();
    }
    private List<Double> getMethod(List<Double> list) throws Exception{
        long end,start,time = 0 ;
        double i,j = 0;
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("collectionsTimingParameters.txt", true)));
        while(j <= 100) {
            i = ( Math.random() * 2000);
            start = System.nanoTime();
            list.get((int)i);
            end = System.nanoTime();
            time += (end - start);
            j++;
        }
        Object toWrite = "\n" + "Get (index) method for " + list.getClass().getSimpleName() +
                " time " + time/100 + ", collection size is ";
        out.print(toWrite);
        out.close();
        return list;
    }
}
