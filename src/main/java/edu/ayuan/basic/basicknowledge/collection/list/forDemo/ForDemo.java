package edu.ayuan.basic.basicknowledge.collection.list.forDemo;

import java.util.ArrayList;
import java.util.List;

//for(元素数据类型，变量名： 数组或是collection集合)
public class ForDemo {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("*******************");

        String[] strArray = {"element type ", " : ", "variable name(Arraylist,llist)"};
        for (String s : strArray) {
            System.out.print(s);

        }
        System.out.println();
        System.out.println("*******************");

        List<String>list =new ArrayList<String>();
        list.add("element type ");
        list.add(" : ");
        list.add("variable name(Arraylist,llist)");

        for(String s :list){
            System.out.println(s);
        }
    }
}