package edu.ayuan.basic.basicknowledge.innerClass.innerClass1;

public class InnerDemo {
    public static void main(String[]args){
        //创建内部类对象，并调用方法
//        成员内部类，外界如何创建对象使用呢？
//外部类.内部类 对象名 = 外部类对象.内部类对象；
//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        Outer o =new Outer();
        o.method();
    }

}
