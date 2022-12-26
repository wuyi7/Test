package com.company.Data.linkedlist;

import java.util.List;

/**
 * @Author: WuYi at 2022-10-07 17:18
 * @Description:
 * @Version:1.0
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        Node Node1 = new Node(1, "a", "aaa");
        Node Node2 = new Node(2, "b", "aaa");
        Node Node3 = new Node(3, "c", "aaa");
        Node Node4 = new Node(4, "d", "aaa");
        Node Node5 = new Node(4, "d", "ccc");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.addByOrder(Node1);
        singleLinkedList.addByOrder(Node2);
//        singleLinkedList.deleteNode(Node3);
//        singleLinkedList.deleteNode(Node3);
//        singleLinkedList.deleteNode(Node3);
        singleLinkedList.list();
        System.out.println(singleLinkedList.size());
        //System.out.println(singleLinkedList.findK(1));
        SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        singleLinkedList2.addByOrder(Node3);
        singleLinkedList2.addByOrder(Node4);
        System.out.println("----------------------------");
        singleLinkedList2.list();
        System.out.println("----------------------------");
        SingleLinkedList combine = LinkedListUtils.combine(singleLinkedList, singleLinkedList2);
        combine.list();

    }
}



class LinkedListUtils {
    public static SingleLinkedList combine(SingleLinkedList a, SingleLinkedList b) {
        SingleLinkedList c = new SingleLinkedList();
        Node temp = a.getHeadNode().next;
        while (temp != null) {
            Node tempNode = new Node(temp.no, temp.name, temp.nickName);
            c.addByOrder(tempNode);
            temp = temp.next;
        }
        Node temp2 = b.getHeadNode().next;
        while (temp2 != null) {
            Node tempNode = new Node(temp2.no, temp2.name, temp2.nickName);
            c.addByOrder(tempNode);
            temp2 = temp2.next;
        }
        return c;
    }
}


