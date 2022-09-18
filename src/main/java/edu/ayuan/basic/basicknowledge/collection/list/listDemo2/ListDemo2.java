package edu.ayuan.basic.basicknowledge.collection.list.listDemo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {


    public static void main(String[] args) {
//        创建list集合对象
        List<Student> ls = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("qingxia", 30);
        Student s2 = new Student("zuxian", 31);
        Student s3 = new Student("liming", 40);
//将学生添加到集合中
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);

//       迭代器方式
        Iterator<Student> it = ls.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("*************");

//        for循环方式
        for (int i = 0; i < ls.size(); i++) {
            Student s = ls.get(i);
            System.out.println(s.getName() + "," + s.getAge());

        }
    }
}