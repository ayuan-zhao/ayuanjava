package edu.ayuan.basic.methods;

//public static 数据类型  方法名（参数）{
//    return 数据；}
//方法定义时return后面的返回值与方法定义上的数据类型要匹配
//方法的返回值通常会使用变量接收，否则该返回值讲无意义

public class ReturnValueCall {
    public static void main(String[] args) {
        //返回值类型，变量名 = 方法名（实参）不要忘记写实参
        //在main()方法中调用定义好的方法，并使用变量保存
        boolean number = isEvenNumber(10);
        System.out.println(number);
        //在main()方法中调用定义好的方法并直接打印结果
        System.out.println(isEvenNumber(15));
    }


    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getMax(int a, int b) {
        return 100;
    }
}
