package edu.ayuan.basic.methods;

import java.util.Scanner;

public class Findmethod {
//查找指定的数据在数据中的索引

    /**
     * 写方法的时候要有两个明确： 返回值类型：int 参数：int[]arr,int number
     */

    public static void main(String[] args) {

        int[] arr = {12, 34, 56, 78, 90};
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert the number you want to find");
        int number = sc.nextInt();
//定义在前面比较好，实参就比较好写
        getIndex(arr, number);


    }

    public static int getIndex(int[] arr, int number) {
        int index = -1;

        for (int x = 0; x < arr.length; x++) {
            //要记得清楚，分的清楚，number是我自己输入的，arr[]才是我要接收的
            if (arr[x] == number) {
                System.out.println("this number is "+arr[x]);
                //要有一个变量，接收这个特别的x.
                index = x;
                break;//break 以后就不会再接着循环了

            }
        }

        System.out.println("index:" + index);
        return index;
    }
}