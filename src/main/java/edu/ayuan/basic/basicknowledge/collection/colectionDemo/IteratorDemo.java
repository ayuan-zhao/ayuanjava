package edu.ayuan.basic.basicknowledge.collection.colectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
Iterator :迭代器，集合的专用遍历方式
Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方式得到的迭代器是通过集合的iterator()

 */
public class IteratorDemo {

    public static void main(String[] args) {
//        1.创建集合对象
        Collection<String> c = new ArrayList<String>();
//     2.   添加元素  add element
        c.add("hello");
        c.add("world");
        c.add("java");
//        或者
        String s = "python";
        c.add(s);
//
//        3.遍历集合
//        通过集合对象获取迭代器对象！

        Iterator<String> i = c.iterator();
//        Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator（）方法得到
        //Iterator<String>是一个接口,iterator返回的是Iterator的实现类对象，所以说是以多态的方式得到的

//        E.next();返回迭代中的下一个元素
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());//.NoSuchElementException

//
//        boolean hasNext（）：如果迭代器具有更多元素，则返回True
//        4.通过迭代器对象的hasNext（）方法判断是否还有元素
        while(i.hasNext()){
//            System.out.println(i.next());
            String s2 = i.next();//用个变量接收，以后可以用这个变量
            System.out.println(s2);
//        for (String s2 : c) {
//            System.out.println(s2);
        }


    }
}
