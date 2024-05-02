package com.dataStucture.queue;

/**
 * @classname al-Khwarizmi
 * @Auther d3Lap1ace
 * @Time 5/2/2024 10:50 PM Thu
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Test {
    public static void main(String[] args) {
        SequentialQueue<Integer> queue = new SequentialQueue<>();
        queue.initQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(5);
        System.out.println(queue.getHead());
        queue.enQueue(7);
        System.out.println(queue.deQueue());
        System.out.println(queue.getHead());
        queue.enQueue(23);
        queue.enQueue(54);


        queue.getAll();
    }
}
