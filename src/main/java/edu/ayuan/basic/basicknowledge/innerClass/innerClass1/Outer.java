package edu.ayuan.basic.basicknowledge.innerClass.innerClass1;

/*
内部类访问特点：
内部类可以直接访问外部类的成员，包括私有
外部类要访问内部类的成员，必须创建对象

内包括，成员内部类  和  局部内部类（在方法体里面）

成员内部类，外界如何创建对象使用呢？
外部类.内部类 对象名 = 外部类对象.内部类对象；
Outer.Inner oi =new Outer().new Inner();

 */
public class Outer {

    private int num = 10;

    /*
    public class Inner {

        public void show() {
            System.out.println(num);//内部类可以访问内部的属性
        }
     */
    private class Inner {

        public void show() {
            System.out.println(num);//内部类可以访问内部的属性
        }
    }
    public void method() {
//        show();这个show方法是在内部类里面定义的方法，外部的方法不能直接访问，只能创建对象，再调用
        Inner i = new Inner();
        i.show();
    }

}

