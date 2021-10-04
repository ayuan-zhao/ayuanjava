package edu.ayuan.basic.methods;

import java.util.Scanner;

public class Find {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        Scanner sc = new Scanner(System.in);
        //用Scanner的时候，要输出一个介绍，要不都不知道有这行代码呀
        System.out.println("请输入要查找的数据");
        int number = sc.nextInt();
        //索引变量，初始值为-1；
        int index = -1;

        for (int x = 0; x < arr.length; x++) {
           //要记得清楚，分的清楚，number是我自己输入的，arr[]才是我要接收的
            if (arr[x] == number) {
                System.out.println(arr[x]);
                //要有一个变量，接收这个特别的x.
                index = x;
                break;//break 以后就不会再接着循环了
            }

        }
        System.out.println("number is "+ number);
        System.out.println("index:"+ index);
    }
}

