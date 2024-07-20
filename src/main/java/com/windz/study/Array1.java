package com.windz.study;

public class Array1 {
    public static void main(String[] args) {
        //静态初始化
        int[] arr = {1,2,3,4,5};
        int[] arr2= new int[]{1,2,3};
        //动态初始化
        int[] agesArr= new int[3];
        int[] scoresArr = new int[10];

        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++){
            //在循环的过程中，i依次表示数组中的每一个索引
            System.out.println(arr[i]);//就可以把数组里面的每一个元素都获取出来，并打印在控制台上了。
        }
    }
}
