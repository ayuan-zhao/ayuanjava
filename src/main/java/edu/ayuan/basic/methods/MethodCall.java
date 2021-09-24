package edu.ayuan.basic.methods;
//实参：方法调用中的参数，等同于使用变量或常量，例如：10，a
//形参：方法定义中的参数，等同于变量定义格式，例如：int number

public class MethodCall {
    public static void main(String[] args) {
        //变量的调用Variable call
        int a = 10;
        isEvenNumber(a);


        //常量值的调用Constant value call
        isEvenNumber(15);
        //一个方法可以被调用好几次
    }

    public static void isEvenNumber(int number) {
        //以上的（int number）是形式参数，是数据类型和变量名组成的
        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}



