package edu.ayuan.basic.basicknowledge.laiofferdataStrcture.hashSet;

import java.util.HashSet;

/**
 * 底层数据结构是哈希表
 * 对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
 * 没有带索引的方法，所以不能使用普通for循环遍历
 * 由于是Set集合，所以是不包含重复元素的集合
 *
 * 根据对象的哈希值计算对象的存储位置，如果该位置没有元素，就存储元素
 * 存入的元素和以前的元素比较哈希值，如果哈希值不同，会向下执行，把元素添加到集合
 * 如果哈希值相同，会调用对象的equals方法
 * 如果返回false,会继续向下执行，把元素添加到集合
 * 如果返回true,说明元素重复，不存储
 */

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

//        添加元素
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("java");

        //增强for的遍历
        for(String s :hs){
            System.out.println(s);
        }

    }

}
