package edu.ayuan.basic.basicknowledge.collection.list.forDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//遍历集合
//迭代器：集合特有的遍历方式
//普通for：带有索引的遍历方式
//增强for: 最方便的遍历方式
public class ForDemo2 {

    public static void main(String[] args) {
//        创建list集合对象
        List<Student> list = new ArrayList<>();

//        创建学生对象
        Student s1 = new Student("AAA", 32);
        Student s2 = new Student("BBB", 33);
//        把学生添加到集合
        list.add(s1);
        list.add(s2);

//   迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName()+","+ s.getAge());

        }
        for(int i = 0; i< list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName()+","+ s.getAge());
        }
        for (Student s : list){
            System.out.println(s.getName()+","+ s.getAge());
        }
    }
}
