package com.dataStucture.queue;

/**
 * @classname al-Khwarizmi
 * @Auther d3Lap1ace
 * @Time 5/2/2024 10:35 PM Thu
 * @description 保持队头始终在索引为0的位置
 * @Version 1.0
 * From the Laplace Demon
 */


public class SequentialQueue<T> {
    //初始化长度  10
    private static final int MAXLEN = 10;


    Object[] queueData;

    int tail;   // 队尾索引

    public SequentialQueue(){}

    // 初始化队列
    public void initQueue(){
        this.queueData = new Object[MAXLEN];
        this.tail = -1;
    }

    //清空队列
    public void chlearQueue(){
        for (int i = 0; i < this.tail; i++) {
            queueData[i] = null;
        }
        tail = -1;
    }

    //判断队列是否为空
    public boolean queueEmpty(){
        return tail == -1;
    }

    // 获得队头元素
    public T getHead(){
        return (T) queueData[0];
    }

    // 入队
    public void enQueue(T data){

        if(this.tail + 1 == MAXLEN ){
            throw new OutOfMemoryError();
        }

        this.queueData[++tail] = data;
    }

    public T deQueue(){
        if(this.queueEmpty()){
            return null;
        }
        T data = (T)queueData[0];
        System.arraycopy(queueData,1,queueData,0,tail);
        queueData[tail--] = null;
        return data;
    }

    public int queueLength(){
        return tail+1;
    }

    public void getAll(){
        for (int i = 0; i <= tail; i++) {
            System.out.println("第"+(i+1)+"个元素是:"+queueData[i]);
        }
    }





































}
