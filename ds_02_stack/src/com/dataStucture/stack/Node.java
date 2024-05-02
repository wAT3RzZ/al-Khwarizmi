package com.dataStucture.stack;

/**
*    @classname node
*    @description 
*    @Auther d3Lap1ace
*    @Time 2024/04/17  21:下午9:21
*    @Version 1.0
*                        From the Laplace Demon 
*/
public class Node <T>{
    private T data;
    private Node next;

    public Node(){
        this.next=null;
    }

    public Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
