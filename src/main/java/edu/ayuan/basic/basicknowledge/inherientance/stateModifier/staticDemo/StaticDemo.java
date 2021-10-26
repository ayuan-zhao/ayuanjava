package edu.ayuan.basic.basicknowledge.inherientance.stateModifier.staticDemo;
/*
被所有对象所共享的成员，我们用静态修饰
被静态修饰的成员，可以使用对象名访问： s1.university ="NEU";
也可以通过类名访问Student.university ="NEU"
特点：
被类的所有对象共享
 */
public class StaticDemo {

    public static void main(String[] args) {
        Student.university ="NEU";
        Student s1 =new Student();
        s1.name = "xiaxia";
        s1.age = 30;
//        s1.university ="NEU";
        s1.show();

        Student s2 =new Student();
        s2.name ="manyu";
        s2.age = 32;
//        s2.university ="NEU";不需要重复赋值
        s2.show();

    }

}
