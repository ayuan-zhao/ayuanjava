package edu.ayuan.basic.basicknowledge.innerClass.innerClass3;
/*
匿名内部类，是局部内部类的一种形式


 */
public class OuterDemo {

    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();//method里面有Inter类，Inter类里面有show方法，并且调用了show方法
    }
}
