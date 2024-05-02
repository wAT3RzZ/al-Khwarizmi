package com.dataStucture.stack;

/**
    @classname TEst
    @Auther d3Lap1ace
    @Time 2024/04/10:下午5:06
    @Version 1.0
                        From the Laplace Demon 
*/
public class Test {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Node<Integer> node = new Node<>();
        integerStack.setHead(node);
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.pop();
        integerStack.pop();
        integerStack.isEmpty();
        integerStack.peek();
        integerStack.pop();
    }
}
