package com.dataStucture.binaryTree;



/**
    @classname TreeNode
    @Auther d3Lap1ace
    @Time 2024/04/07:下午6:12
    @Version 1.0
                        From the Laplace Demon 
*/
public class Tree {
    Node root;
    public int size;

    public Tree(){
    }

    //插
    public void insert(Node tmproot,Node node){
        if(node.data<tmproot.data){
            if(tmproot.left == null){
                tmproot.left = node;
            }else {
                insert(tmproot.left,node);
            }
        } else {
            if(tmproot.rigth == null){
                tmproot.rigth = node;
            }else
                insert(tmproot.rigth,node);
        }



    }
    //增
    public void add(int data){
        Node node = new Node(data, null, null);
        if(root == null){
            root = node;
        }else {
            insert(root,node);
        }
        size++;

    }
    // 删除数据
    public Node delNode(Node root, int value){
        if(root == null){
            return root;
        }
        if(value <root.data){
            delNode(root.left,value);
        }else if(value > root.data)
            delNode(root.rigth, value);
        else {
            if(root.left == null)
                return root.rigth;
        }

        return root;
    }
//    //删除数据
//    public static Node delnode(Node tmpRoot,int data){
//        if(tmpRoot.data > data) delnode(tmpRoot.left,data);
//        else if(tmpRoot.data < data) delnode(tmpRoot.rigth,data);
//        else {
//            if(tmpRoot.left == null && tmpRoot.rigth == null){   //子叶节点删除
//
//                return null;
//            }
//            else if(tmpRoot.left == null || tmpRoot.rigth == null){ // 删除的节点有一个孩子
//                return tmpRoot.left != null ? tmpRoot.left : tmpRoot.rigth;
//            }else {   //删除的节点有2个孩子
//                Node current = findMin(tmpRoot.rigth);   //找右孩子最小值
//                tmpRoot.data = current.data;   //赋值给当前节点
//                tmpRoot.rigth = delnode(tmpRoot.rigth,current.data); //删除最小节点
//            }
//        }
//
//        return tmpRoot;
//    }
//    //辅助方法
//    public static Node findMin(Node node){
//        while (node.left != null){
//            node = node.left;
//        }
//        return node;
//    }
//    //删除 v2.0
//    public void deletNode(int data){
//        Node reNode = new Node();
//        if(this.root == null){
//            return;
//        }
//
//
//        else if(this.root.data > data) deletNode(this.root.left.data);
//        else if(this.root.data < data) deletNode(this.root.rigth.data);
//        else {
//            //子叶节点
//            if(this.root.left == null && this.root.rigth == null){
//
//            }
//        }
//    }





}
