package com.company.Data.stack;


import com.company.Data.linkedlist.Node;
import com.company.Data.linkedlist.SingleLinkedList;

import java.util.Scanner;

/**
 * @Author: WuYi at 2022-10-12 16:49
 * @Description:
 * @Version:1.0
 */
public class ArrayStackDemo {
    public static void main(String[] args) {

        //ArrayStack arrayStack = new ArrayStack(4);
        LinkedListStack arrayStack = new LinkedListStack();
        char key = ' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):入栈");
            System.out.println("p(pop):出栈");
            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    arrayStack.list();
                    break;
                case 'a':
                    Node node = new Node(1, "a", "aa");
                    arrayStack.push(node);
                    break;
                case 'p':
                    try {
                        Node pop = arrayStack.pop();
                        System.out.println(pop);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
            }
        }
        System.out.println("程序退出！");
    }
}

class ArrayStack {
    private int maxSize;
    private int[] stack;//用数组模拟栈，数据就放在该数组中
    private int top = -1;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }
        int i = stack[top];
        top--;
        return i;
    }

    //从栈顶开始显示
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空");
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }
}

class LinkedListStack {
    private SingleLinkedList stack = new SingleLinkedList();//用数组模拟栈，数据就放在该数组中
    private int top = -1;


    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Node node) {
        top++;
        stack.add(node);
    }

    public Node pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }
        Node k = stack.findK(1);
        top--;
        stack.deleteNode(k);
        return k;
    }

    //从栈顶开始显示
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空");
            return;
        }
        stack.reverse();
        stack.list();
    }
}

