package edu.ayuan.basic.basicknowledge.laiofferdataStrcture.api.objectDemo;

public class Student  extends Object{


    private String name;
    private int age;

    public Student() {

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//            "name='" + name + '\'' +
//            ", age=" + age +
//            '}';

//    }

//    @Override
//    public boolean equals(Object o) {
//        //this————————s1
////        o ————————s2
////        比较地址是否相同，如果相同，直接返回true
//        if (this == o) {
//            return true;
//        }
//        //判断参数是否为null，如果为null返回false
//        if (o == null ||  getClass() != o.getClass()) {//自解码对象
////            判断两个对象是否来自于同一个类
//            return false;
//        }
////        向下转型
//        Student student = (Student) o;//把这个o强转为student，student =s2
//
//        if (age != student.age) {
//            return false;
//        }
//        return name != null ? name.equals(student.name) : student.name == null;
//    }

//
}





