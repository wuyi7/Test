package com.company.Data.queue;

/**
 * @Author: WuYi at 2022-10-07 16:01
 * @Description:
 * @Version:1.0
 */
public class CircleArrayQueue {
    private int maxSize;
    //初始值为0
    private int front;
    private int rear;
    private int[] arr;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize + 1;
        arr = new int[this.maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void addQueue(int value) {
        if (isFull()) {
            System.out.println("the queue is full!");
            return;
        }
        arr[rear] = value;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty!");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("the queue is empty!");
            return;
        }

        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\t", i % maxSize, arr[i % maxSize]);
        }
        System.out.println();
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

    public int showPeek() {
        if (isEmpty()) {
            throw new RuntimeException("the queue is empty!");
        }
        return arr[front];
    }

}
