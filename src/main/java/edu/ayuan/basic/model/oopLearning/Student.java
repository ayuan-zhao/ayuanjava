package edu.ayuan.basic.model.oopLearning;

//main 是程序入口，类不用？
public class Student {
    public String name;
    public int age;
    public String course;
    public String hobby;

    public void showInfo() {
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("course " + course);
        System.out.println("hobby "+ hobby);
    }
}
