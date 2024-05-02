package com.khwarizmi.sort;

/**
    @classname InsertionSort
    @Auther d3Lap1ace
    @Time 2024/03/22:下午4:30
    @Version 1.0
                        From the Laplace Demon 
*/
/*
稳定 空间复杂度O(1) 时间复杂度O(n2) 最差情况：反序，需要移动n*(n-1)/2个元素 最好情况：正序，不需要移动元素

数组在已排序或者是“近似排序”时，插入排序效率的最好情况运行时间为O(n)；插入排序最坏情况运行时间和平均情况运行时间都为O(n2)。
通常，插入排序呈现出二次排序算法中的最佳性能。

对于具有较少元素（如n<=15）的列表来说，二次算法十分有效。在列表已被排序时，插入排序是线性算法O(n)。

在列表“近似排序”时，插入排序仍然是线性算法。在列表的许多元素已位于正确的位置上时，就会出现“近似排序”的条件。

通过使用O(nlog2n)效率的算法（如快速排序）对数组进行部分排序，然后再进行选择排序，某些高级的排序算法就是这样实现的。
 */
public class InsertionSort {
    public static int[] insertionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i,t = arr[i];
            while(j > 0 && t < arr[j-1]){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = t;
        }
        return arr;
    }
    public static void display(int[] array){
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,23,2,32,43,453,34,534,23,2};
        insertionSort(arr);
        display(arr);
    }
}
