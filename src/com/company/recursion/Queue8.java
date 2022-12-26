package com.company.recursion;

/**
 * @Author: WuYi at 2022-10-24 15:28
 * @Description:
 * @Version:1.0
 */
public class Queue8 {
    int max = 8;
    int[] array = new int[max];
    static int count;
    static int judgeCount;

    public static void main(String[] args) {
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.println(count);
        System.out.println(judgeCount);
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        //依次放入并判断
        for (int i = 0; i < max; i++) {
            array[n] = i;
            if (judge(n)) {
                check(n + 1);
            }//如果冲突 则继续执行循环
        }
    }

    private boolean judge(int n) {
        judgeCount++;
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
