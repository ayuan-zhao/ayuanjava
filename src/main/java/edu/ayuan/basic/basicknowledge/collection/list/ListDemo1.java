package edu.ayuan.basic.basicknowledge.collection.list;

import edu.ayuan.basic.basicknowledge.collection.colectionDemo.IteratorDemo2.Student;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
有序，存储和取出的元素顺序一致
可重复：存储的元素可以重复
 */
public class ListDemo1 {

    public static void main(String[] args) {
        //创建集合对象
//        list是继承自 collection的
        List<String> l = new ArrayList<String>();
//        添加元素
        l.add("hello");
        l.add("world");
        l.add("java");
//        void add(int index,E element)在此集合中的指定位置插入指定的元素
        System.out.println("void add(int index,E element)，add方法，没有返回值，手动打印了List l 的值：");
        l.add(1,"javavavava");//把它放在第01的位置，原先位置的元素，往后放
        System.out.println(l);
        System.out.println("************************");


//        E remove(int index):删除指定索引处的元素，返回被删除的元素
        System.out.println("E remove(int index)被删除的元素是： ");
        System.out.println(l.remove(1));
        System.out.println(l);
        System.out.println("************************");


//        E set(int index, E element): 修改指定索引处的元素，返回被修改的元素
        System.out.println(" E set(int index, E element)被修改的元素是");
        System.out.println(l.set(1,"javaeeee"));
        System.out.println(l);

        System.out.println("************************");


//        E get (int index):返回指定索引处的元素
        System.out.println("E get (int index):指定索引处的元素是");
        System.out.println(l.get(1));
        System.out.println(l);

        System.out.println("************************");

//   用for循环输出
        System.out.println("用for + get 循环输出结果");
        for (int i = 0; i <l.size();i++ ){
            String s = l.get(i);
            System.out.println(s);

            System.out.println("************************");

            System.out.println("用iterator 循环输出结果");
            Iterator<String> it = l.iterator();
            while (it.hasNext()) {
                String ss = it.next();
                System.out.println(ss);
            }

        }
    }
}
