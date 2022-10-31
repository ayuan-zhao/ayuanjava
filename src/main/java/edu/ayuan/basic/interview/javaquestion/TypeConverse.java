package edu.ayuan.basic.interview.javaquestion;

public class TypeConverse {
//    int 转double，既可以显性的转，也可以隐形的转
//    double转 int只能 显性的转，不能隐形的转
//It's okay to cast low-precision numbers to high-precision type implicitly;

//implicit conversion :no括号（double）(int)
//    explicit conversion: with 括号（double）(int)
//    byte  - short - int -long - float - double
//    widening:精度

    public static void main(String[] args) {
        int x = 7;
        double y = (double) x;
        System.out.println(y);//7.0

        double x2 = 7.1;
        int y2 = (int) x2;
        System.out.println(y2);//7

        int x3 = 7;
        double y3 = x3;
        System.out.println(y3);//7.0

        double x4 = 7.1; //
//        int y4 = x4;
//        System.out.println(y4);

    }

    public void task1() {
        int a = 2, b = 4, c = 8;
        double result = (double) (a + b / c);
        //b/c 向下取整是0， 2+ 0 = 2，转换成double是2。0
        System.out.println(result);//2.0
    }

    public void task2() {
        int a = 2, b = 4, c = 8;
        double result = a + (double) (b / c);
//        b/c = 0，0转换成double是0.0,+ 2 再转换成double是2.0
        System.out.println(result);//2.0
    }

    //    ！！！！重点看第3题
    public void task3() {
        int a = 2, b = 4, c = 8;
        double result = a + ((double) (b)) / c;
//       先转化b ->4.0， 4.0/8，根据优先级高的来，是0.5 + 2.0 = 2.5
        System.out.println(result);//2.5

    }

    public void task4() {
        int a = 2, b = 4, c = 8;
        double result = a + 1.0 * b / c;
//       1.0*b = 4.0, 4.0/8 = 0.5 + 2 = 2.5
        System.out.println(result);//2.5
    }
}
