package com.company.Data.linkedlist;

/**
 * @Author: WuYi at 2022-10-12 15:24
 * @Description:
 * @Version:1.0
 */
public class Josephu {
    public static void main(String[] args) {
        circleSingleLinkedList circleSingleLinkedList = new circleSingleLinkedList();
        circleSingleLinkedList.addBoys(125);
        circleSingleLinkedList.showOnLine(10,20,125);
    }
}

class circleSingleLinkedList {
    private Boy first;

    public void addBoys(int nums) {
        if (nums < 1) {
            System.out.println("nums不正确");
            return;
        }
        Boy curBoy = null;
        for (int i = 1; i < nums + 1; i++) {
            Boy boy = new Boy(i);
            //如果是第一个
            if (i == 1) {
                first = boy;
                first.setNext(first);
                curBoy = first;
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    public void showBoy() {
        if (first == null) {
            System.out.println("链表为空");
            return;
        }
        Boy curBoy = first;
        while (true) {
            System.out.printf("小孩的编号是%d\n", curBoy.getNo());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    public void showOnLine(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("不合理数据");
            return;
        }
        Boy helper = first;
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        //移动坐标
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        //报数出圈
        //判断只有一个人的时候直接出圈
        while (true) {
            if (helper == first) {
                break;
            }
            for (int i = 0; i < countNum - 1; i++) {
                first = first.getNext();//first指向节点为出圈小孩
                helper = helper.getNext();
            }
            System.out.printf("小孩%d出圈\n", first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后的小孩%d出圈\n", first.getNo());
    }
}

class Boy {
    private Boy next;
    private int no;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
