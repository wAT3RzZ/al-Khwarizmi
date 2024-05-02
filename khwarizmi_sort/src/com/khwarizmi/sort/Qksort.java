package com.khwarizmi.sort;

/**
    @classname Qksort
    @Auther d3Lap1ace
    @Time 2024/04/01:下午3:07
    @Version 1.0
                        From the Laplace Demon 
*/
public class Qksort {
    public static void quickSort(int[] arr,int l, int r){
        if(l >= r)
            return;
        int left = l,rigth = r;
        int pivot = arr[left];
        while (left < rigth){
            while (left < rigth && arr[rigth] >= pivot){
                rigth--;
            }
            if(left < rigth) arr[left] = arr[rigth];
            while (left < rigth && arr[left] <= pivot){
                left++;
            }
            if(left < rigth) arr[rigth] = arr[left];
            if(left >= rigth) arr[left] = pivot;
        }
        quickSort(arr, l, rigth-1);
        quickSort(arr,left+1,r);
    }

    public static int[] sort(int[] arr){
        sort(arr,0,arr.length-1);
        return arr;
    }
    public static void sort(int[] arr,int start,int end){
        if(start >= end) return;
        int p = qksort(arr, start, end);
        sort(arr, start, p-1);
        sort(arr,p+1,end);
    }
    private static int qksort(int[] arr,int start,int end){
        int p = arr[start]; int low = start; int high = end;
        while (low < high){
            while (low < high && arr[high] >= p)    high--;
            arr[low] = arr[high];
            while (low < high && arr[low] <= p)   low++;
            arr[high] = arr[low];
        }
        arr[low] = p;
        return low;
    }

    private static void qksortPro(int[] arr,int start,int end){
        if(start >= end){
            return;
        }
        int p = arr[start];
        int low = start;
        int high = end;
        while (low < high){
            while (low < high && arr[high] >= p)    high--;
            if(low < high) arr[low] = arr[high];
            while (low < high && arr[low] <= p)   low++;
            if(low < high) arr[high] = arr[low];
            if(low > high) arr[low] = p;
        }

        qksortPro(arr,start,high - 1);
        qksortPro(arr,low+1,end);
    }
    public static void main(String[] args) {
        int[] array = new int[]{3,5,1,8,2,4,9};
        int[] arrayPro = new int[]{3,5,1,8,2,4,9,2,5,34,5,3,2,8,5,6,3,10};
        array = sort(array);
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
        System.out.println();
//        arrayPro = sort(arrayPro);
//        qksortPro(arrayPro,0,arrayPro.length-1);
//        for (int i = 0; i < arrayPro.length; i++) System.out.print(arrayPro[i] + " ");
//        System.out.println();
        quickSort(arrayPro,0,arrayPro.length-1);
        for (int i = 0; i < arrayPro.length; i++) System.out.print(arrayPro[i] + " ");
    }
}
