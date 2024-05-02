package com.khwarizmi.sort;

/**
    @classname Test
    @Auther d3Lap1ace
    @Time 2024/04/02:下午3:31
    @Version 1.0
                        From the Laplace Demon 
*/
public class Test {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // 找到分区的索引，这里我们使用数组的最后一个元素作为基准
            int partitionIndex = partition(array, low, high);

            // 递归地对左半部分进行快速排序
            quickSort(array, low, partitionIndex - 1);

            // 递归地对右半部分进行快速排序
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // 选择最后一个元素作为基准
        int i = (low - 1); // 指向比基准小的最后一个元素的索引

        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于基准
            if (array[j] <= pivot) {
                i++;

                // 交换array[i]和array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 交换array[i+1]和array[high]（或基准）
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // 返回分区界限索引
        return i + 1;
    }
}
