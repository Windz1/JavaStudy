package com.windz.study;

import java.util.Scanner;

import static java.lang.System.in;

public class text3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        System.out.println("请输入第一个整数：");
        int math1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int math2 = sc.nextInt();

        boolean a = math1 == 6 || math2 == 6 || (math2+math1)%6 == 0;

        System.out.println(a);
    }
}
