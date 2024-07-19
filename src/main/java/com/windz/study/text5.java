package com.windz.study;
import java.util.Scanner;
public class text5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3.分别录入三个数字
        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int k = sc.nextInt();
        //4.定义变量代表最小值
        int min;

        min=(i<j ? i:j);
        System.out.println(min<k ? min: k);
    }
}
