package edu.ayuan.basic.basicknowledge.api;

/*
没有构造方法，使用类的成员

看类的成员是否是静态的，如果是，通过类名就可以直接调用，不需要构造方法来创建对象

 */
public class MathDemo {

    public static void main(String[] args) {
        //    Math包含执行基本数字运算的方法
//    public static int abs(int a):返回参数的绝对值
        System.out.println(Math.abs(-88));//绝对值
        System.out.println("*****************");
//        public static double ceil(double a):返回大于或等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.34));//这个返回的也是13.0 这个返回值是double值
        System.out.println(Math.ceil(12.56));
        System.out.println("*****************");

//        public static double  floor (double a)返回小于或等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.34));//这个返回的也是12.0 这个返回值是double值
        System.out.println(Math.floor(12.56));

//        round是四舍五入的算法
        System.out.println("*****************");
        System.out.println(Math.round(12.34F));//
        System.out.println(Math.round(12.56F));

//        找最大值
        System.out.println("*****************");
        System.out.println(Math.max(66, 88));
//        找最小值
        System.out.println(Math.min(66, 88));

//        返回a的b次幂
        System.out.println(Math.pow(2.0, 3.0));//2的3次方
        System.out.println("*****************");
//        返回一个随机的double的正值
        System.out.println(Math.random()*100);
//        取整数
        System.out.println((int)(Math.random()*100)+1);


    }


}
