package com.company.Data.linkedlist;

/**
 * @Author: WuYi at 2022-10-12 17:26
 * @Description:
 * @Version:1.0
 */
public class SingleLinkedList {
    private final Node headNode = new Node(0, "", "");

    public Node getHeadNode() {
        return headNode;
    }

    public void add(Node node) {
        Node temp = headNode;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        //退出循环之后，temp指向链表最后,再把新的加上即可
        temp.next = node;
    }

    public void addByOrder(Node node) {
        Node temp = headNode;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            //如果node的no在中间，那就插入在中间插入
            if (temp.next.no > node.no) {
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            //都没实现，temp后移继续遍历
            temp = temp.next;
        }
        //最后判断flag，如果真 则已存在，不能添加。否则插入
        if (flag) {
            System.out.printf("已经存在%d编号，不能添加\n", node.no);
        } else {
            //先连接node和右边
            node.next = temp.next;
            //再连接node和左边
            temp.next = node;
            System.out.printf("%d编号添加成功\n", node.no);
        }

    }

    //要用temp.next.no去比较
    public void deleteNode(Node node) {
        isNotEmpty();
        Node temp = headNode.next;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;//已遍历完
            }
            if (temp.next.no == node.no) {
                //找到编号并可以开始更新
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.printf("未找到编号%d的节点\n", node.no);
        }
    }


    public void updateNode(Node node) {
        isNotEmpty();
        Node temp = headNode.next;
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
        } else {
            System.out.printf("未找到编号%d的节点", node.no);
        }
    }

    public void isNotEmpty() {
        if (headNode.next == null) {
            System.out.println("链表为空");
        }
    }

    public void list() {
        //判断是否空
        isNotEmpty();
        Node temp = headNode.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public int size() {
        Node temp = this.headNode;
        int count = 0;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node findK(int k) {
        int size = size();
        if (k > size) return null;
        int n = size - k + 1;
        Node temp = this.headNode;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //不停的往head后面插
    public void reverse() {
        Node cur = headNode.next;
        Node next = null;
        Node newHead = new Node(0, "", "");

        while (cur != null) {
            next = cur.next;//将cur.next保存到next上
            cur.next = newHead.next;//将newHead.next即第二位保存到cur.next上
            newHead.next = cur;//将cur保存到newHead.next上，即cur插入到第二位了
            cur = next;//右移指针
        }
        headNode.next = newHead.next;
    }
}
