package edu.ayuan.basic.basicknowledge.api.Array1;

import java.util.Arrays;
/*
Arrays类，是一个工具类，工具类的设计思想
构造方法用Private 修饰--------防止外界创建对象
成员用public static 修饰------------使用类名来使用该成员方法 Array.sort()
 */
public class ArrayDemo {

    public static void main(String[] args) {
//        定义一个数组
        int[]arr ={246,55,946,777,888,564,33};
        System.out.println("排序前："+ Arrays.toString(arr));//注意是Arrays
        Arrays.sort(arr);
        System.out.println("after sort"+ Arrays.toString(arr));
    }

}
