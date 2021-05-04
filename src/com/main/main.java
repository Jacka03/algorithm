package com.main;

import com.sort.selectionsort.SelectionSort;
import com.tools.Integers;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1};

        for (int i : arr) {
            System.out.print(i+" ");

        }
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");

        }
    }

    public static void bubblesort3(Integer[] array){

        for(int end = array.length; end > 1; --end){
            int index = 0;
            for(int begin = 1; begin < end; ++begin){
                if(array[begin-1] > array[begin]){
                    int tem = array[begin-1];
                    array[begin-1] = array[begin];
                    array[begin] = tem;
                }else {
                    index = begin;
                }
            }

            end = index;
        }

    }

    public static void bubblesort2(Integer[] array){
        int count = 0;
        for(int end = array.length; end > 1; --end){
            boolean flag = true;
            for(int begin = 1; begin < end; ++begin){
                if(array[begin-1] > array[begin]){
                    int tem = array[begin-1];
                    array[begin-1] = array[begin];
                    array[begin] = tem;
                    flag = false;
                }

            }
            count++;
            if(flag){
                break;
            }
        }
        Integers.println(array);
        System.out.println(count);

    }

    // public static void bubblesort1(Integer[] array){
    //     for(int end = array.length; end > 1; --end){
    //         for(int begin = 1; begin < end; ++begin){
    //             if(array[begin-1] > array[begin]){
    //                 int tem = array[begin-1];
    //                 array[begin-1] = array[begin];
    //                 array[begin] = tem;
    //             }
    //         }
    //     }
    //     Integers.println(array);
    // }
    public static void bubbleSort1(Integer[] arr){

        for(int count = arr.length; count > 1; --count){
            for(int end = 1; end < count; ++end){
                if(arr[end-1]>arr[end]){
                    int tem = arr[end-1];
                    arr[end-1] = arr[end];
                    arr[end] = tem;
                }
            }
        }
        Integers.println(arr);
    }


}
