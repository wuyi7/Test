package com.company.Data.linkedlist;

/**
 * @Author: WuYi at 2022-10-12 10:38
 * @Description:
 * @Version:1.0
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        Node2 Node1 = new Node2(1, "a", "aaa");
        Node2 Node2 = new Node2(2, "b", "aaa");
        Node2 Node3 = new Node2(3, "c", "aaa");
        Node2 Node4 = new Node2(4, "d", "aaa");
        Node2 Node5 = new Node2(4, "d", "ccc");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.list();
        doubleLinkedList.addByOrder(Node2);
        doubleLinkedList.addByOrder(Node1);
        doubleLinkedList.addByOrder(Node4);
        doubleLinkedList.addByOrder(Node3);
        //doubleLinkedList.add(Node5);
        doubleLinkedList.list();
        doubleLinkedList.updateNode(Node5);
        doubleLinkedList.list();
        doubleLinkedList.deleteNode(Node3);
        doubleLinkedList.deleteNode(Node5);
        doubleLinkedList.list();


    }
}

class DoubleLinkedList {
    private Node2 headNode = new Node2(0, "", "");

    public void list() {
        //判断是否空
        if (isNotEmpty()) return;
        System.out.println("-------------遍历List---------------");
        Node2 temp = headNode.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println("------------------------------------");
    }

    public boolean isNotEmpty() {
        if (headNode.next == null) {
            System.out.println("链表为空");
            return true;
        }
        return false;
    }

    public void add(Node2 node) {
        Node2 temp = headNode;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        //退出循环之后，temp指向链表最后,再把新的加上即可
        temp.next = node;
        node.pre = temp;//形成双向链表
        System.out.printf("编号%d添加成功\n", node.no);
    }

    //跟单向一样
    public void updateNode(Node2 node) {
        if (isNotEmpty()) return;
        Node2 temp = headNode.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;//已遍历完
            }
            if (temp.no == node.no) {
                //找到编号并可以开始更新
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = node.name;
            temp.nickName = node.nickName;
            System.out.printf("更新编号%d成功\n", node.no);
        } else {
            System.out.printf("未找到编号%d的节点", node.no);
        }
    }

    public void deleteNode(Node2 node) {
        if (isNotEmpty()) return;
        Node2 temp = headNode.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;//已遍历完
            }
            if (temp.no == node.no) {
                //找到编号并可以开始更新
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            //如果是最后的节点有空指针异常
            if (temp.next != null) temp.next.pre = temp.pre;
            System.out.printf("删除编号%d成功\n", node.no);
        } else {
            System.out.printf("未找到编号%d的节点\n", node.no);
        }
    }

    public void addByOrder(Node2 node) {
        Node2 temp = headNode;
        while (true) {
            if (temp.next == null) {
                node.pre = temp;
                temp.next = node;
                System.out.printf("插入编号%d成功\n", node.no);
                break;
            }
            if (temp.next.no > node.no) {
                temp.next.pre = node;
                node.next = temp.next;
                node.pre = temp;
                temp.next = node;
                System.out.printf("插入编号%d成功\n", node.no);
                break;
            } else if (temp.next.no == node.no) {
                System.out.printf("已存在编号%d，插入失败\n", node.no);
            }
            temp = temp.next;
        }
    }
}

class Node2 {
    public int no;
    public String name;
    public String nickName;
    public Node2 next;
    public Node2 pre;


    public Node2(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Node{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
