package com.tianli.study.test.bilibili;

import java.util.Scanner;

public class p42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入考试成绩");
        int score = sc.nextInt();
        if (score>=0 && score<= 100) {
            if (score > 95 ) {
                System.out.println("送自行车一辆");
            } else if (score > 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if (score > 81 && score <= 90) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("打一顿");
            }
        }
        else{
            System.out.println("输入的成绩不符合");
        }




    }
}
