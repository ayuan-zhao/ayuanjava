package edu.ayuan.basic.methods.constructionMethod.arrayList;

import java.util.ArrayList;
//jdk里自带的数据结构/类
//用重载的方法定义了三个构造函数
/**
    *  Arraylist添加方法:
    *     1.public boolean add(E e)将指定元素追加到此集合的末尾
 *     2.public void add(int index, E element):在此集合中的指定位置插入指定的元素
    */
public class ArrayListDemo1 {



    public static void main(String[] args) {

//创建一个空的集合对象
//        ArrayList<String>array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<String>();
//jdk里面有public boolean add(E e)将指定元素追加到此集合的末尾
//        System.out.println(array.add("hello"));
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add(1,"beautiful");
        array.add (3,"easy");


        System.out.println("array:" + array);

    }

}