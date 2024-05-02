package com.dataStucture.binaryTree;

/**
    @classname Node
    @Auther d3Lap1ace
    @Time 2024/04/07:下午6:10
    @Version 1.0
                        From the Laplace Demon 
*/
public class Node {
    int data;
    public Node left;
    public Node rigth;

    public Node() {
    }

    public Node(int data, Node left, Node rigth) {
        this.data = data;
        this.left = left;
        this.rigth = rigth;
    }


}
