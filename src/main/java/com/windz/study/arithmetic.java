package com.windz.study;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class arithmetic {
    public static void main(String[] args) {
        Scanner math = new Scanner(in);

        out.println("请输入一个数字:");

        int i = math.nextInt();

        if (i % 2 == 0) {
            out.println("此数为偶数");
        } else {
            out.println("此数为奇数");
        }
    }
        }

