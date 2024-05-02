package com.khwarizmi.sort;

/**
    @classname ShellSort
    @Auther d3Lap1ace
    @Time 2024/03/23:上午9:57
    @Version 1.0
                        From the Laplace Demon 
*/
public class ShellSort {
     public static int[] shellsort(int[] arr,int dp){
         int i,j,l= arr.length;
         for(;l>0;l/=2){
             for(i = 1; i < l;i++) {
                 j = i;
                 int k = arr[i];
                 while (j > 0 && k < arr[j-1]){
                     arr[j] = arr[j-1];
                     j--;
                 }
                 arr[j] = k;
             }
         }
         return arr;
     }

     public static void show(int[] arr){
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+",");
         }
     }

    public static void main(String[] args) {

        int[] arr = {1,23,45,3,55,45,4,2,32,3,2};
        shellsort(arr, 5);
        show(arr);
    }
}
