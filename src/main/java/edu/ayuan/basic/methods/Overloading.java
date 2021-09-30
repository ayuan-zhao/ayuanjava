package edu.ayuan.basic.methods;
//认的是参数个数，参数型，而不是参数名
//方法重载指在同一个类中定义的多个方法之间的关系，满足的相互构成重载
//多个方法在同一个类中
//多个方法具有相同的方法名
//多个方法的参数不相同，类型不同或者数量不同
//重载仅对应方法的定义，与方法的调用无关，调用方式参照标准格式
//重载仅针对同一类中方法的名称与参数进行识别，与返回值无关，换句话说不能通过返回值来判定两个方法是否构成重载

//    与void show (int a,char b,double c){}构成重载的有

//    与void show (int x,char v,double t){}//no,同样的方法，名称不能相同，不构成重载
//    与void show (int a,double c，char b){}//可以，因为参数顺序不一样
//    boolean show(int a,char b)//可以，参数个数不同
//    void shows (double b){}//不构成，因为方法名根本不一样


public class Overloading {
    public static void main(String[] args) {
        //(String[] args) 形参，在调用的适合传进来的实际的值是实参
        Overloading t4 = new Overloading();

        t4.mOL(2);
        t4.mOL(2, 3);
        t4.mOL("overloading learning");
        //以上括号里的是实参

    }

    public static void mOL(int i) {
        System.out.println(i * i * i);
    }

    public static void mOL(int x, int y) {
        System.out.println(x * y);

    }

    public static void mOL(String s) {
        System.out.println("s");


    }
}

