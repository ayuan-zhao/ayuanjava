package edu.ayuan.basic.methods.constructionMethod.string;

import java.util.Scanner;

/**
 * 遍历字符串，并计算大写，小写，数字的数量
 */

public class String4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please insert a String:");
        String line = sc.nextLine();
        int uppercase = 0;
        int lowercase = 0;
        int number = 0;
        //遍历字符串，得到每一个字母
        System.out.print("the String is ");
        for (int i = 0; i < line.length(); i++) {
            //设一个变量接收，打出来的String
            char ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                uppercase++;
            } else if (ch >= 'a' && ch <= 'z') {
                lowercase++;
                //别忘了char 一定要加单引号！！！！ 否则没用，不识别
                //别忘了是>=，和<=,没有等号会少记录！！
            } else if (ch >= '0' && ch <= '9') {
                number++;

            }
            //不能在这打the string is,否则不是会循环这个line.length遍嘛，放循环上面
            System.out.print( line.charAt(i));
        }
        System.out.println();//换行在这换，否则放上面还是每个数字打一行
        System.out.println("uppercase is " + uppercase);
        System.out.println("lowercase is " + lowercase);
        System.out.println("number is " + number);
    }
}
