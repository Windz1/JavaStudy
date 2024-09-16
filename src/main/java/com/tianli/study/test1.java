package com.tianli.study;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int s1 = number %10;
        int s2 = number /10%10;
        int s3 = number /10/10%10;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
