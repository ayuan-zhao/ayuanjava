package edu.ayuan.basic.methods.constructionMethod.arrayList;

import java.util.ArrayList;

/**
 * ArrayList 常用方法 public boolean remove(Object o):删除指定的元素，返回删除是否成功 public E remove(int
 * index):删除指定索引处的元素，返回被删除的元素 public E set(int index,e element):修改指定索引处的元素，返回被修改的元素 pubic E get (int
 * index):返回指定索引处的元素 public int size():返回集合中的元素个数
 */
public class ArrayListDemo2 {

    public static void main(String[] args) {
//        创建集合
        ArrayList<String> array = new ArrayList<String>();
//        添加元素
        array.add("hello");
        array.add("world");
        array.add("nice to meet you");
//控制变量法，每次只测一个功能，不相关的先注释掉
////      1. public boolean remove(Object o):删除指定的元素，返回删除是否成功,返回值是boolean,动作会做
//        System.out.println(array.remove("world"));

////      2.  如果没有删除成功，返回false
//        System.out.println(array.remove("java"));

//        3. public E remove(int index):删除指定索引处的元素，返回被删除的元素
//
//        4.System.out.println(array.remove(1));

//        5.System.out.println(array.set(2,"welcome"));

//        6.pubic E get (int index):返回指定索引处的元素，不改变，只是拿到索引处的元素
//        System.out.println(array.get(0));

//        7.public int size():返回集合中的元素个数
//        System.out.println(array.size());

        System.out.println("array:" + array);

    }

}
