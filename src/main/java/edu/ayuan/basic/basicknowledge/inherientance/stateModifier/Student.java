package edu.ayuan.basic.basicknowledge.inherientance.stateModifier;

import static edu.ayuan.basic.basicknowledge.inherientance.stateModifier.staticDemo.Student.university;

/*
静态成员方法只能访问静态成员

非静态的成员方法都可以访问，非静态全否可以访问
静态的成员方法，能访问静态的成员变量，能访问静态的成员方法

main不是成员方法，new开辟了空间，类已经实例化，静态main方法就可以调用非静态的类方法
 */
public class Student {

    public int age;

//    public int age = 20;


    //    非静态成员变量
    private String name = "xiaxia";
    //    静态成员变量
    private static String uninversity = "MIT";

    //     非静态成员方法
    public void show1() {

    }

    //    非静态成员方法,可以访问静态或非静态的成员变量，方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();

        show3();
    }

    //        静态成员方法
    public static void show3() {

    }
/*
静态方法只能访问静态成员

 */
    public static void show4() {
//        System.out.println(name);//name是非静态的，所以报错了
        System.out.println(university);
//        show1();//show1()是非静态的，所以报错了
        show3();

    }
}




