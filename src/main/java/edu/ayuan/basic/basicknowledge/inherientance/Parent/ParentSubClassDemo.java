package edu.ayuan.basic.basicknowledge.inherientance.Parent;

public class ParentSubClassDemo {
    /* 程序入口 */
    public static void main( String[] args )
    {
        System.out.println( "子类main方法" );
        SubClass sc =new SubClass();
        sc.shows();

//       1. 先调父类静态变量，静态初始化块(每个类只运行一次，有多个对象的时候，只有第一个对象运行，其他就不再运行了)
//       2. 子类静态变量，初始化块
//       3. 父类变量，初始化块，构造器
//       4. 子类变量，初始化块，构造器
    }
}


