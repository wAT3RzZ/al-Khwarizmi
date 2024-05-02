package com.dataStucture.link;

/**
    @classname Node
    @Auther d3Lap1ace
    @Time 2024/03/22:上午9:55
    @Version 1.0
                        From the Laplace Demon 
*/
public class Node {

    public int data;//数据域
    public Node next; //指针域


    //显示此节点
    public void display() {
        System. out.print( data + " ");
    }


    public Node(int data){
        this.data = data;
        this.next = null;
    }



    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
