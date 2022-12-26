package com.company.Data.sparsearray;

/**
 * @Author: WuYi at 2022-10-07 13:58
 * @Description:
 * @Version:1.0
 */
public class SparseArrayUtils {
    public static void printChessArray(int[][] array) {
        for (int[] row : array) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }

    public static void printSparseArray(int[][] sparseArr) {
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
    }

    public static int[][] changeChessToSparseArray(int[][] array) {
        //two-dimensional change to sparsearray
        int sum = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt != 0) {
                    sum++;
                }
            }
        }
        //System.out.println(sum);
        //create sparsearray
        int sparseArr[][] = new int[sum + 1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = array[i][j];
                    count++;
                }
            }
        }
        return sparseArr;
    }

    public static int[][] changeSparseToArray(int[][] array) {
        //traverse the two-dimensional array, put the nonzero value into the sparseArray.
        int row = array[0][0];
        int col = array[0][1];
        int sum2 = array[0][2];
        int[][] chessArr = new int[row][col];
        for (int i = 1; i < array.length; i++) {
            int rowi = array[i][0];
            int coli = array[i][1];
            int val = array[i][2];
            chessArr[rowi][coli] = val;
        }
        return chessArr;
    }
}
