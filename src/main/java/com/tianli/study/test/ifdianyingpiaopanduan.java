package com.tianli.study.test;

import java.util.Scanner;

public class ifdianyingpiaopanduan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个票号");
        int ticker = sc.nextInt();
//1111111111111
        if (ticker >= 0 && ticker <= 100 ){

          if (ticker % 2 == 0 ){
            System.out.println("坐右边");}
          else{
            System.out.println("坐左边");
          }
        }


}
}