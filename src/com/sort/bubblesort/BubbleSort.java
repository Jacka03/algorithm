package com.sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {

    // 升序
    // 一般写法
    public void bubbleSort(int[] array){
        for(int count = array.length; count > 1; --count){
            for(int start = 1; start < count; ++start){
                if(array[start-1] > array[start]){
                    int tem = array[start-1];
                    array[start-1] = array[start];
                    array[start] = tem;
                }
            }
        }
    }

    // 优化，如果前面没有排序部分都有序了那就提前终止。（有局限性，时间不一定比优化前快
    public void bubbleSort1(int[] array){
        for(int count = array.length; count > 1; --count){
            boolean flag = true;
            for(int start = 1; start < count; ++start){
                if(array[start-1] > array[start]){
                    int tem = array[start-1];
                    array[start-1] = array[start];
                    array[start] = tem;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    // 优化，对于没有排序部分，如果从某个位置开始到最后都是有序的，那就记录该位置，下一趟比较交换只到这里
    public void bubbleSort2(int[] array){

        for(int count = array.length; count > 1; --count){

            // flag初值主要是为了完全有序做准备的，当初值减一满足这层for的结束条件就OK了。
            int flag = 1;  // 该位置往后都是有序的，
            for(int start = 1; start < count; ++count){

                if(array[start-1] > array[start]){
                    // ary[k] = ary[k - 1] + (ary[k - 1] = ary[k]) * 0;//一步交换
                    int tem = array[start-1];
                    array[start-1] = array[start];
                    array[start] = tem;
                    flag = 0;
                }
                flag++;

            }
        }
    }


}
