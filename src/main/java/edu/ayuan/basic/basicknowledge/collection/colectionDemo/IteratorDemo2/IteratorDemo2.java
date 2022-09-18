package edu.ayuan.basic.basicknowledge.collection.colectionDemo.IteratorDemo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {

    public static void main(String[] args) {
//        创建Collection集合对象
        Collection<Student> c = new ArrayList<Student>();
//        创建学生对象
        Student s1 = new Student("Afra", 31);
        Student s2 = new Student("Aya", 32);
        Student s3 = new Student("Amanda", 33);
//        把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
//        遍历集合（迭代器方式）
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName()+","+s.getAge());
        }


    }

}
