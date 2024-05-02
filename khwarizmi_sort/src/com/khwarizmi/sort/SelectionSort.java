package com.khwarizmi.sort;

import static java.lang.System.in;

/**
    @classname SelectionSort
    @Auther d3Lap1ace
    @Time 2024/03/20:上午11:21
    @Version 1.0
                        From the Laplace Demon 
*/
public class SelectionSort {
    private static boolean less (Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }


    //交换
    private static void exch(Comparable[] a, int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    //输出
    private static void show(Comparable[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    //自然排序
    public static boolean isSorted(Comparable[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(less(arr[i],arr[i-1])) return false;
        }
        return true;
    }



    // 选择排序(书)
    public static void sort(Comparable[] arr){
        // 将arr[]按升序排列
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            int min = i;                              // 最小元素的索引
            for (int j = i+1; j < N; j++) {
                if(less(arr[j],arr[min])) min = j;
            exch(arr,i,min);
            }
        }
    }
    //选择排序
    public static void sort_seletion(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            int min = i;          //记录最小值索引
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            if( i != min){  //减小计算量
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 5, 3, 6, 2, 10, 2, 1 };
        sort_seletion(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }


}
