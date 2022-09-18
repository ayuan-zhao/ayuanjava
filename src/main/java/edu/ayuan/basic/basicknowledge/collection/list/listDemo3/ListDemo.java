package edu.ayuan.basic.basicknowledge.collection.list.listDemo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//找错误的规律，讲的为什么会报错，在控制台看运行过程找原因，发现是方法调用时发生错误，就进入方法查看源码
public class ListDemo {

    public static void main(String[] args) {
//        创建集合对象
        List<String> l1 =new ArrayList<String>();
//        添加元素
        l1.add("hello");
        l1.add("java");
        l1.add("world");
//        遍历集合，得到每一个元素，看有没有"world"这个元素，如果有，就田间一个javaee元素
        Iterator<String>is =l1.iterator();//注意，第一个Iterator是大写，第二个 list的对象.iterator是小写
        while(is.hasNext()){
            String s = is.next();
            if(s.equals("world")){
                l1.add("javaee");
            }
        }
        System.out.println(l1);
//        ConcurrentModificationException并发修改异常
    }


}
