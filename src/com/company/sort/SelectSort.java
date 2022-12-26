package com.company.sort;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: WuYi at 2022-11-02 14:51
 * @Description:
 * @Version:1.0
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        //int[] arr = {101, 34, 119, 1, 6, 4, 5};
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 800000);
        }
        Date date = new Date();
        selectSort(arr);
        Date date1 = new Date();
        System.out.println("排序时间：" + (date1.getTime() - date.getTime()) + "ms");

        System.out.println(Arrays.toString(arr));
    }

    static void selectSort(int[] arr) {

        for (int j = 0; j < arr.length - 1; j++) {
            //第j次
            int minIndex = j;
            int min = arr[minIndex];
            for (int i = j + 1; i < arr.length; i++) {
                if (min > arr[i]) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            //节省时间，只有出现新的min才交换
            if (minIndex != j) {
                arr[minIndex] = arr[j];
                arr[j] = min;
            }
            //第j轮之后
//            System.out.printf("第%d次排序", j + 1);
//            System.out.println(Arrays.toString(arr));
        }

//        //第一次
//        int minIndex = 0;
//        int min = arr[minIndex];
//        for (int i = 1; i < arr.length ; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        arr[minIndex] = arr[0];
//        arr[0] = min;
//        //第一轮之后
//        System.out.println(Arrays.toString(arr));
//
//        //第2次
//        minIndex = 1;
//        min = arr[minIndex];
//        for (int i = 2; i < arr.length ; i++) {
//            if (min > arr[i]) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        arr[minIndex] = arr[1];
//        arr[1] = min;
//        //第2轮之后
//        System.out.println(Arrays.toString(arr));
//    }
    }
}
