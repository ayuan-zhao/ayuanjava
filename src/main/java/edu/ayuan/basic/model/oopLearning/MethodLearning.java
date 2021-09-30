package edu.ayuan.basic.model.oopLearning;

/**
 *
 */
public class MethodLearning {
//    默认的的构造方法，前面有没有访问的修饰符跟定义的类有关，类是public的，默认的构造方法就是public的默认的类是缺省的，它的构造方法就是缺省的
//



    //方法只有被调用的时候才会被执行
    int area = getArea(3, 5);

    private int getArea(int x, int y) {

        return x * y;
        //return的结果交给Test4来处理，用变量接收 return的结果
//        同一个类中，所有的方法可以直接调用，不用new去实例化





    }
}

