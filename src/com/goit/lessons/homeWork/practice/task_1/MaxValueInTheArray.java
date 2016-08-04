package com.goit.lessons.homeWork.practice.task_1;

/*
Найти наибольшее число в массиве. Гарантируется, что массив всегда не пустой.
 */
public class MaxValueInTheArray {
    private  void maxElement(int array[]){
        int max = array[0];
        for (int anArray : array) {
            if (max < anArray) {
                max = anArray;
            }
        }
        System.out.println("\n" + "Max value in the array is " + max);
    }
    private int[] fillArray(){
        int[] arrayA = new int[10];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = ((int) (Math.random() * 60) - 10);
            System.out.print("  " + arrayA[i]);
        }
        return arrayA;
    }

    public static void main(String[] args) {
        MaxValueInTheArray maxValueInTheArray = new MaxValueInTheArray();
        maxValueInTheArray.maxElement(maxValueInTheArray.fillArray());
    }
}
