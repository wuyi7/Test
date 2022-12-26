package com.company.sort;

import java.util.Arrays;
import java.util.Date;

/**
 * @Author: WuYi at 2022-11-02 15:19
 * @Description:
 * @Version:1.0
 */
public class insertSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        //int[] arr = {101, 34, 119, 1, 6, 4, 5};
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 800000);
        }
        Date date = new Date();
        insertSort(arr);
        Date date1 = new Date();
        System.out.println("排序时间：" + (date1.getTime() - date.getTime()) + "ms");

        System.out.println(Arrays.toString(arr));
    }

    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            //第一轮 34 插入到{101}
            int insertVal = arr[i];
            //待插入的数组的下标
            int insertIndex = i - 1;

            //Index>0保证不越界，<0说明到头了，直接插
            //indexVal < arr[insertIndex] 待插入的数，说明还没找到插入位置，arr[insertIndex]需要往后移
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //退出说明找到位置，insertIndex+1;
            arr[insertIndex + 1] = insertVal;

//            System.out.printf("第%d次排序", i);
//            System.out.println(Arrays.toString(arr));
        }
    }


}
