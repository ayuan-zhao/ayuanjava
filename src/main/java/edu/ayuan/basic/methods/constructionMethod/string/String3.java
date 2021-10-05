package edu.ayuan.basic.methods.constructionMethod.string;

import java.util.Scanner;

/**
 * Iterate over the string遍历字符串:对象.charAt(循环下标)
 */
public class String3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please insert a string");
        String line = sc.nextLine();

        //i需要定义变量类型，String类型，line.length(),后面需加括号
        for(int i=0;i<line.length();i++){
            //字符串遍历的通用操作！！
            System.out.println(line.charAt(i));//********很重要啊，charAT是索引下标,int index

        }
    }
}
