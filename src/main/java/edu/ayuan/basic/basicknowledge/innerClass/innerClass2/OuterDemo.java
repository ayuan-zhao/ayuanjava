package edu.ayuan.basic.basicknowledge.innerClass.innerClass2;

public class OuterDemo {
    public static void main(String[]args){
        Outer o =new Outer();//新建外部类
        o.method();//调用外部类的方法，method的方法里有内部类和内部类的show方法
    }

}
