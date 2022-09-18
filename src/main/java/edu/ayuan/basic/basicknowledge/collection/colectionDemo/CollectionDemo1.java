package edu.ayuan.basic.basicknowledge.collection.colectionDemo;

import java.util.ArrayList;
import java.util.Collection;

/*
可变
存储和取出数据
collection----1,单列集合，2。双列集合（map）
1.单列集合--------------（1）list可重复的；（2）set不可重复的
        （1）list ----------1.ArrayList  2.linkedList
         (2)set--------------1.HashSet   2.TreeSet
2.双列集合
        （1）HashMap

 */
public class CollectionDemo1 {

    public static void main(String[] args) {
//        创建collection集合的对象
        Collection<String> c = new ArrayList<String>();

//        添加元素： boolean add(E e)
        c.add("hello");
        c.add("world");
        c.add("java");
    }

}
