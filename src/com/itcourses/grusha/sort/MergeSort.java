package com.itcourses.grusha.sort;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;


import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {

    private static int[] array;
    private static int[] tempMergArr;
    private static int length;

    public static void main(String a[]) {

         int[] bigArrayMergeSort = new int[100000];
        for (int element : bigArrayMergeSort) {
            element = ThreadLocalRandom.current().nextInt(0, 100000);
        }
        int[] bigArrayBubbleSort = bigArrayMergeSort.clone();

        long startTime = System.currentTimeMillis();
        mergeSort(bigArrayMergeSort);
        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time for merge sort " + estimatedTime);

        startTime = System.currentTimeMillis();
        bubbleSort(bigArrayBubbleSort);
        estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Time for buble sort " + estimatedTime);


    }

    public static void mergeSort(int inputArr[]) {
        array = inputArr;
        length = inputArr.length;
        tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private static void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    static void bubbleSort(int[] arr) {
        int arrayLength = arr.length;
        int temp = 0;
        for (int barrier = 0; barrier < arrayLength; barrier++) {
            for (int index = 1; index < (arrayLength ); index++) {
                if (arr[index - 1] > arr[index]) {
                    //swap elements
                    temp = arr[index - 1];
                    arr[index - 1] = arr[index];
                    arr[index] = temp;
                }

            }
        }

    }
}



