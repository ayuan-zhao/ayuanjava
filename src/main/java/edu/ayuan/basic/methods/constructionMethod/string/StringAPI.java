package edu.ayuan.basic.methods.constructionMethod.string;

import java.util.Scanner;

/**
 * API，application Programming Interface，应用程序编程接口 虽然String的值是不可变的，但是他们可以被共享 字符串的底层原理是字节数组（byte[]）
 */

public class StringAPI {

    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);//其实是调用了一个构造方法，（System.in）是构造方法的参数
        System.out.println("请输入一个字符串数据");
        //接收数据
        String line = sc.nextLine();//sc.nextline()这其实是sc的对象，调参数
        //输出结果
        System.out.println("你输出的数据是" + line);
    }

}
