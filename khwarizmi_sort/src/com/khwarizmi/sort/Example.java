package com.khwarizmi.sort;

/**
    @classname Example
    @Auther d3Lap1ace
    @Time 2024/03/22:下午2:57
    @Version 1.0
                        From the Laplace Demon 
*/
public class Example {
    private static boolean less (Comparable v,Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(less(arr[i],arr[i-1])) return false;
        }
        return true;
    }
    // 选择排序
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


}
