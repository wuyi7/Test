package com.company.Data.sparsearray;

import static com.company.Data.sparsearray.SparseArrayUtils.*;

/**
 * @Author: WuYi at 2022-10-06 17:54
 * @Description:
 * @Version:1.0
 */
public class SparseArray {
    public static void main(String[] args) {
        //make a two-dimensional array 11*11
        //0: no chess pieces, 1: black ,2 white
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[3][2] = 1;

        printChessArray(chessArr1);
        int[][] sparseArr = changeChessToSparseArray(chessArr1);
        printSparseArray(sparseArr);
        int[][] chessArr2 = changeSparseToArray(sparseArr);
        printChessArray(chessArr2);
    }
}


