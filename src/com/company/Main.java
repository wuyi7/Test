package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        rotate(ints,3);
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
        }
    }

    static void rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);

    }
}
