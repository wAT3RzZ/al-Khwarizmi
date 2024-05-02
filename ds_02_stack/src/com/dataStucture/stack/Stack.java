package com.dataStucture.stack;

/**
*    @classname Stack
*    @description 
*    @Auther d3Lap1ace
*    @Time 2024/04/17  21:下午9:24
*    @Version 1.0
*                        From the Laplace Demon 
*/
public class Stack<T> {
    private Node head;


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    //进栈
    public void push(T n){
        if(n == null){
            throw new NullPointerException("kong");
        }else{
            Node<T> node = new Node<>(n, head);
            head = node;
        }
    }
    public T pop(){
        if(head == null) {
            return null;
        }else {
            T t = (T) head.getData();
            head.setNext(head.getNext());
            return t;
        }
    }

    public T peek(){
        return (T)head.getData();
    }
    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

}
