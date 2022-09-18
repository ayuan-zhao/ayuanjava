package edu.ayuan.basic.basicknowledge.collection.colectionDemo;

import java.util.ArrayList;
import java.util.Collection;

//command +7 _____快捷键，可以打开Structure，能够看到类的所有信息
public class CollectionDemo2 {

    public static void main(String[] args) {
        //创建集合对象Create a collection object
        Collection<String> c = new ArrayList<String>();

//        bollean add(E e)：添加元素，输出true，说明添加元素成功
        System.out.println(c.add("hello"));
        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println("world");//可以存储相同的String,并且会一直返回true

//        boolean remove(Object o):从集合中移除指定的元素
        System.out.println(c.remove("world"));
//        输出集合对象
        System.out.println(c);

//        c.clear();清空所有方法
//        c.clear();//操作完就成空集了，要注意

//      boolean contains(Object o):判断集合中是否存在指定的元素
        System.out.println("集合里是否包含hello？ " + c.contains("hello"));

//    判断集合是否为空 boolean.isempty
        System.out.println("这个集合是空的？ " + c.isEmpty());

//        集合的长度
        System.out.println("集合的长度是： "+ c.size());
//    输出集合对象
        System.out.println( c );


    }

}
