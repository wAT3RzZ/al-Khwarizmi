package com.dataStucture.link;

/**
    @classname TestLinkedList
    @Auther d3Lap1ace
    @Time 2024/03/22:上午10:21
    @Version 1.0
                        From the Laplace Demon 
*/
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList linkList = new LinkedList();
        linkList.addFirstNode(20);
        linkList.addFirstNode(21);
        linkList.addFirstNode(19);
        //print19,21,20
        linkList.add(1, 22); //print19,22,21,20
        linkList.add(2, 23); //print19,22,23,21,20
        linkList.add(3, 99); //print19,22,23,99,21,20
        //调用此方法会print 19,22,23,99,21,20
        linkList.displayAllNodes();
    }


}
