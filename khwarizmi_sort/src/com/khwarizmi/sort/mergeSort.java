package com.khwarizmi.sort;

/**
    @classname mergeSort
    @Auther d3Lap1ace
    @Time 2024/03/24:上午11:25
    @Version 1.0
                        From the Laplace Demon 
*/
public class mergeSort {
//    public static void inPlaceMergeSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = left + (right - left) / 2;
//
//            // 递归地对左半部分进行原地归并排序
//            inPlaceMergeSort(arr, left, mid);
//
//            // 递归地对右半部分进行原地归并排序
//            inPlaceMergeSort(arr, mid + 1, right);
//
//            // 合并两个已排序的子数组
//            mergeInPlace(arr, left, mid, right);
//        }
//    }
//
//    // 合并两个已排序的子数组到原数组中
//    private static void mergeInPlace(int[] arr, int left, int mid, int right) {
//        int i = left; // 左子数组的起始索引
//        int j = mid + 1; // 右子数组的起始索引
//
//        // 当左子数组中的所有元素都处理完，或者右子数组中的所有元素都处理完时结束
//        while (i <= mid && j <= right) {
//            if (arr[i] <= arr[j]) {
//                i++;
//            } else {
//                // 将右子数组中的元素逐步向左移动，直到找到合适的位置
//                int temp = arr[j];
//                int k = j;
//                while (k > i && arr[k - 1] > temp) {
//                    arr[k] = arr[k - 1];
//                    k--;
//                }
//                arr[k] = temp;
//                // 更新左右子数组的索引
//                mid++;
//                j++;
//            }
//        }
//    }

    // 辅助方法，用于打印数组
    public static void printArray(char[] arr) {
        for (char num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int[] arr = {12, 11, 13, 5, 6, 7};
//        System.out.println("Original array:");
//        printArray(arr);
//
//        inPlaceMergeSort(arr, 0, arr.length - 1);
//
//        System.out.println("Sorted array:");
//        printArray(arr);
//
        System.out.println("*********************************");
        char[] chars = {'A', 'E', 'Q', 'S', 'U', 'Y', 'E', 'I', 'N', 'O', 'S', 'T'};
        System.out.println("original array:");
        printArray(chars);
        inPlaceMergeSort(chars,0, chars.length-1 );
        System.out.println("sorted array:");
        printArray(chars);
        System.out.println("*********************************");
        char[] chars1 = {'A', 'E', 'Q', 'S', 'U', 'Y', 'E', 'I', 'N', 'O', 'S', 'T'};
        System.out.println("original array:");
        printArray(chars1);
        sort(chars1,0, chars1.length);
        System.out.println("sorted array:");
        printArray(chars1);

    }

    public static void mergeInPlace(char[] arr,int left,int mid,int rigth){
        int i = left; int j = mid +1;
        while (i <= mid && j <= rigth){
            if( arr[i] < arr[j])
                i++;
            else {
                int k = j;
                char tmp = arr[j];
                while (k > i && arr[k - 1 ] > tmp) {
                    arr[k] = arr[k - 1];
                    k--;
                }
                arr[k] = tmp;
                //更新左右子数的索引
                mid++;
                j++;
            }
        }
    }
    public static void inPlaceMergeSort(char[] arr,int left,int rigth){
        if(left < rigth){
            int mid = left + (rigth - left) /2;

            inPlaceMergeSort(arr,left,mid);
            inPlaceMergeSort(arr,mid+1,rigth);
            mergeInPlace(arr,left,mid,rigth);
        }
    }



    public static void sort(char[] arr,int left,int rigth){
        if(arr == null && arr.length == 0){
            return;
        }
        char[] tmp = new char[rigth];
        top_down_MergeSort(arr, left, rigth-1,tmp);
    }
    public static void top_down_MergeSort(char[] arr,int left,int rigth,char[] tmp){
        if(left < rigth){
            int mid = left + (rigth - left) /2;

            top_down_MergeSort(arr,left,mid,tmp);
            top_down_MergeSort(arr,mid+1,rigth,tmp);
            mergeTop_Down(arr,left,mid,rigth,tmp);
        }
    }
    public static void mergeTop_Down(char[] arr,int left,int mid,int rigth,char[] tmp){

        int i = left;
        int j = mid+1;
        int k = left;
        while (i <= mid && j <= rigth){
            if(arr[i] <= arr[j])
                tmp[k++] = arr[i++];
            else
                tmp[k++] = arr[j++];
        }
        while (i <= mid){
            tmp[k++] = arr[i++];
        }
        while (j <= rigth){
            tmp[k++] = arr[j++];
        }
        for (int index = left; index <= rigth; index++) {
            arr[index] = tmp[index];
        }
    }
    public static void merge(int[] integers,int min,int mid,int max) {
        int i=min;
        int j=mid+1;
        int[] aux=new int[integers.length];
        for (int k = 0; k < integers.length; k++) {
            aux[k]=integers[k];
        }
        for(int k=min;k<=max;k++){
            if (i>mid) {
                integers[k]=aux[j++];
            }else if (j>max) {
                integers[k]=aux[i++];
            }else if (aux[i]<aux[j]) {
                integers[k]=aux[i++];
            }else {
                integers[k]=aux[j++];
            }
        }

    }
    /**
     * 自底向上归并排序
     * 外层for循环控制子序列长度
     * 内层for循环控制子序列合并
     * 归并排序算法复杂度O(N²)
     */
    public static int[] sort(int[] integers) {
        for (int i = 1; i < integers.length; i=i+i) {
            for(int j=0;j<integers.length-i;j=j+2*i){
                merge(integers, j, j+i-1, Math.min(j+2*i-1, integers.length-1));
            }
        }
        return integers;
    }
}
