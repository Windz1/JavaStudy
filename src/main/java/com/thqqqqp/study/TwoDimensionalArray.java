package com.thqqqqp.study;

/**
 * 二维数组
 *
 * @author THqqqqp
 * @since 2024/7/17 19:39
 */
public class TwoDimensionalArray {

    public static void main(String[] args) {
        // 静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 动态初始化
        // matrix:矩阵
        int[][] matrix = new int[3][4];
        int[][] arr2 = new int[3][];

        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println("");
        }

        int[][] matrixN = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };

        int[][] ints = rotationMatrix(matrixN);

        for (int[] ints1 : ints) {
            for (int anInt : ints1) {
                System.out.print(anInt + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * 顺时针旋转矩阵
     *
     * @param matrix n*n矩阵
     * @return rotationMatrix 顺时针旋转完的新矩阵
     * @author THqqqqp
     * @since 2024/7/17 22:12
     */
    static int[][] rotationMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        return matrix;
    }
}


