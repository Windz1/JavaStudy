package com.windz.study;

import java.util.Scanner;

public class text4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入第一个数字表示范围的开始：");
        int start = sc.nextInt();
        System.out.println("录入第二个数字表示范围的结束：");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i%3==0 && i%5 == 0){
                System.out.println(i);
            }

        }



    }

}
