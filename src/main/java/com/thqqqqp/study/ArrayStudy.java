package com.thqqqqp.study;

/**
 * 数组学习
 *
 * @author THqqqqp
 * @since 2024/7/16 21:40
 */
public class ArrayStudy {
    public static void main(String[] args) {
        // 声明数组
        String[] strs;
        int[] ints;

        // 初始化数组，分配内存
        String[] strs1 = new String[10];
        int[] ints1 = new int[10];

        // 静态初始化
        String[] strings2 = new String[]{"hello", "world"};
        int[] ints2 = {1, 2, 3, 4, 5};

        // 动态初始化
        int[] ints3 = new int[5];
        for (int i = 0; i < ints3.length; i++) {
            ints3[i] = i;
        }
    }
}
