package com.windz.study;
import java.util.Scanner;
public class textt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入顾客类别（0表示普通顾客，1表示会员顾客）：");
        int a = sc.nextInt();
        System.out.println("请输入购物金额：");
        int b = sc.nextInt();

        if (a==0){
            if (b>0&&b<100){
                System.out.println("您的应付金额为：" +b);
            }else if (b>=100){
                System.out.println("您的应付金额为：" +(b*0.9));
            }else {
                System.out.println("输入金额有误");
            }
        }
        if (a==1){
            if (b>0 && b<200){
                System.out.println("您的应付金额为："+b * 0.8);
            }else if (b>=200){
                System.out.println("您的应付金额为："+b * 0.75);
            }else{
                System.out.println("输入金额有误");
            }
        }
    }

}
