package com.company.Data.queue;

/**
 * @Author: WuYi at 2022-10-07 14:08
 * @Description:
 * @Version:1.0
 */
public class ArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] arr;

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void addQueue(int value) {
        if (isFull()) {
            System.out.println("the queue is full!");
            return;
        }
        rear++;
        arr[rear] = value;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty!");
        }
        front++;
        return arr[front];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("the queue is empty!");
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\t", i, arr[i]);
        }
        System.out.println();
    }

    public int showPeek() {
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty!");
        }
        return arr[front + 1];
    }

}
