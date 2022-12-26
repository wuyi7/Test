package com.company.Data.linkedlist;

/**
 * @Author: WuYi at 2022-10-12 17:29
 * @Description:
 * @Version:1.0
 */
public class Node {
    public int no;
    public String name;
    public String nickName;
    public Node next;

    public Node(int no, String name, String nickName) {
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
