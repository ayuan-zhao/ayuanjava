package edu.ayuan.basic.basicknowledge.inherientance.stateModifier.staticDemo;

public class Student {

    public String name;
    public int age;
    //    public String university;
    public static String university;//被所有对象共享的设置为Static

    //
    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}
