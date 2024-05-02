package com.dataStucture.binaryTree;

/**
    @classname Test
    @Auther d3Lap1ace
    @Time 2024/04/07:下午7:07
    @Version 1.0
                        From the Laplace Demon 
*/
public class Test {
    public static void main(String[] args) {
        Tree tree = new Tree();



        tree.add(20);
        tree.add(1);
        tree.add(42);
        tree.add(19);
        tree.add(34);
        tree.add(65);
        tree.add(27);
        tree.add(29);
        middle(tree.root);
//        delnode(tree.root,27);
        System.out.println();
        middle(tree.root);


    }
    //中序遍历
    public static void middle(Node tmpRoot){
        if(tmpRoot.left != null){
            middle(tmpRoot.left);
        }
        System.out.print(tmpRoot.data+" ");
        if(tmpRoot.rigth != null) {
            middle(tmpRoot.rigth);
        }
    }


}
