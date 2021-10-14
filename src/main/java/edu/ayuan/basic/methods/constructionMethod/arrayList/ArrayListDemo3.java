package edu.ayuan.basic.methods.constructionMethod.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        //创建集合对象
//        ArrayList<String> array = new ArrayList<>();
//        //往集合中添加字符串对象
//        array.add("aaa");
//        array.add("bbb");
//        array.add("ccc");
//        String s = call1(array);
//        System.out.println(s);

        //创建集合对象
        ArrayList<Student> array1 = new ArrayList<Student>();
        //每次调用就会新输入一次学生的信息，提高复用率
        addStudent(array1);
        addStudent(array1);
        addStudent(array1);

//        Student s1 = new Student("lily", 13);
//        Student s2 = new Student("xiangxiang", 14);
//        Student s3 = new Student("newbaby", 1);
//        array1.add(s1);
//        array1.add(s2);
//        array1.add(s3);

        for (int i = 0; i < array1.size(); i++) {
            Student s = array1.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

    public static String call1(ArrayList<String> array) {
//        遍历集合，首先要能够获得到集合中的每一个元素，这个通过get(int index)方法实现
//        System.out.println(array.get(0));
        String s = "";
        for (int i = 0; i < array.size(); i++) {
            s += array.get(i);
            System.out.println(s);
        }
        return s;
    }

////    public static Student student(arrayList array) {
//        for(int i = 0;i<array1.size();i++){
//            Student s = array1.get(i);
//            System.out.println(s.getName()+","+s.getAge());
//
//        }
//    }

    /**
     * 返回值类型：void 参数：ArrayList<Student>array
     */
    public static void addStudent(ArrayList<Student> array) {

        //键盘录入学生对象所需要的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();
        //创建学生对象，把键盘录入的数九赋值给学生对象的成员变量
        Student s1 = new Student();
        s1.setName(name);
        s1.setAge(age);
        //往集合中添加学生对象
//    array1.add(s1);

    }
}
