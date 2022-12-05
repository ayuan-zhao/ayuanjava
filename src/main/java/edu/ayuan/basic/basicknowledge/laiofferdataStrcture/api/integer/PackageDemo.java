package edu.ayuan.basic.basicknowledge.laiofferdataStrcture.api.integer;
/*
基本类型包装类
final类就不可能有子类
将基本数据类型封装成对象的好处是
可以在对象中定义更多的功能方法 操作该数据
常用的操作之一，用于基本数据类型与字符串之间的转换
 */
public class PackageDemo {

    public static void main(String[] args) {
        //需求：判断一个数据是否在int范围里？
        //public static final int MIN_VALUE
        //public static final int MAX_VALUE
//        整型变量占4个字节byte（32）位，最高位用来表示正负，这样剩下31位用来表示数据大小，能表示2的31个数，
//        非负整数要考虑0也占用一个状态
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

}
