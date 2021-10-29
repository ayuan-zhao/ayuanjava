package edu.ayuan.basic.basicknowledge.polymorphism.poly8;
/*
接口类

接口中可以定义变量

接口中的成员变量，默认是常量，被final 修饰，不能修改
默认public final static
默认方法 public abstract 只能是抽象方法




 */
public interface Inter {
    public int num =10;//接口中的成员变量，默认是常量，被final 修饰，
    public final int num2 =20;
    public static final int num3 =30;
    int num4 =40;//和这个效果是一样的

    //public Inter(){}
    // 接口里不能有构造方法，接口对行为进行抽象

    //public void show(){}
//    接口里不能有方法体，不能有非抽象方法

//   抽象方法是可以的
    public abstract void mthod();
    void show();







}
