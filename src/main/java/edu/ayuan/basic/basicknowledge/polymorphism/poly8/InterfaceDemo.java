package edu.ayuan.basic.basicknowledge.polymorphism.poly8;
/*
测试类
 */
public class InterfaceDemo {

    public static void main(String[] args) {
        Inter i = new InterImpl();//左边写接口类，右边写接口实现类
        System.out.println(i.num);
        System.out.println(i.num2);
       System.out.println(Inter.num);//可以直接用接口类名访问，说明是static方法

    }
}