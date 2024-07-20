package com.windz.study;

import java.util.Random;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[10];//动态初始化

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //每循环一次，生成新的随机数
            int number = r.nextInt(100)+1;
            //把生成的随机数添加到数组中
            arr[i] = number;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        System.out.println("数组中的和"+sum);
        int avg = sum/arr.length;
        System.out.println("数组中的平均数"+avg);
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<avg){
                count++;
            }
        }
        System.out.println("数组中一共有"+count+"个比平均数小");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    }

