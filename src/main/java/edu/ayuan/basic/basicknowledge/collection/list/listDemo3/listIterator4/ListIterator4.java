package edu.ayuan.basic.basicknowledge.collection.list.listDemo3.listIterator4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator4 {

    public static void main(String[] args) {
//        创建集合对象
        List<String> list = new ArrayList<>();


        list.add("hello");
        list.add("world");
        list.add("java");

//        通过List集合的listIterator()方法得到
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }

        System.out.println("————————————————");
     while(lit.hasPrevious()){
         String s = lit.previous();
         System.out.println(s);

     }

    }

}
