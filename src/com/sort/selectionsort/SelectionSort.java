package com.sort.selectionsort;

public class SelectionSort {

    public void selectionSort(int[] array){
        for(int count = array.length; count > 1; --count){

            int maxIndex = 0;
            for(int start = 1; start < count; ++start){
                if(array[maxIndex] <= array[start]){
                    maxIndex = start;
                }
            }

            int tem = array[maxIndex];
            array[maxIndex] = array[count-1];
            array[count-1] = tem;


        }

    }
}
