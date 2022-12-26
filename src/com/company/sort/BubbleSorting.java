package com.company.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author: WuYi at 2022-11-02 10:48
 * @Description:
 * @Version:1.0
 */
public class BubbleSorting {
    public static void main(String[] args) {

        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 800000);
        }
        Date date = new Date();
        bubbleSorting3(arr);
        Date date1 = new Date();
        System.out.println("排序时间：" + (date1.getTime() - date.getTime()) / 1000 + "s");
    }

    static void bubbleSorting(int[] arr) {
        for (int j = arr.length - 1; j > 0; j--) {
            //(int i = 0; i < arr.length - 1; i++)就是这里的i<arr.length-1变成j即可
            //循环次数一次比一次少一个，用j--循环实现
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //show the step
            System.out.printf("第%d次排序", arr.length - j);
            System.out.println(Arrays.toString(arr));
        }
    }

    static void bubbleSorting3(int[] arr) {
        boolean flag = false;
        for (int j = arr.length - 1; j > 0; j--) {
            //(int i = 0; i < arr.length - 1; i++)就是这里的i<arr.length-1变成j即可
            //循环次数一次比一次少一个，用j--循环实现
            for (int i = 0; i < j; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = true;//交换了那就为true
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            //show the step
//            System.out.printf("第%d次排序", arr.length - j);
//            System.out.println(Arrays.toString(arr));
            if (!flag) {
                break;//如果都没交换，说明这次循环可以结束了，不用再去走下面的小节了
            } else flag = false;//交换了那就重新置为false
        }
    }

    static void bubbleSorting2(int[] arr) {
        //第一次排序
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        //show the step
        System.out.println("第1次排序");
        System.out.println(Arrays.toString(arr));

        //第二次排序，其实就是去掉最大那个数再走一次，即循环的路径变到arr.length-2
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        //show the step
        System.out.println("第2次排序");
        System.out.println(Arrays.toString(arr));
    }
}
