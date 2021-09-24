package edu.ayuan.basic.model;

public class Test7DataSwap {


    //1，DataSwap ds =new DataSwap 存到了栈中，地址BE2500
    //2,ds引用对象存到了栈中，地址是AD9500,值是newDataSwap()对象在堆中的地址BE2500
    //3，调用Swap方法，先给ds1引用对象保存到栈中，地址是AD9600, 存的值来自入实参（ds）,
    //也就是ds的栈中的地址，这个值实际上就是之前new DaraSwap()对象在堆内存中地址。
    //到第三个步骤的适合，实际上， Ds,ds1其实都z是指向同一个对象。，这个对象就是在堆内存中地址是BE2500上保存，
    //swap(ds)相当于传地址  ，ds和ds1都是引用对象，

    //ds1   可以直接用，因为ds1是形参，static类型
    // 传递 ds到swap中，需要一个dataswap实例对象ds1接受，ds1不用实例化

    public static void swap(DataSwap ds1){
        ds1.a =6;
        System.out.println("在swap方法中，ds1.a的值是："+ds1 .a);
    }

    public static void main(String[] args) {
        //dataswap是一个类，ds是它的实例化对象，
        DataSwap ds = new DataSwap();
        //DataSwap 里 int a ,默认初始化值是：0；
        System.out.println("调用swap方法之前，ds.a的值是："+ ds.a);
        swap(ds);
        System.out.println("调用swap方法之后，ds.a的值是："+ ds.a);
        //ds和ds1操作的是同一个对象

    }
}
//方法的参数传递，如果方法形参是基本数据类型，那么实参（实际的数据）向形参传递参数时，就是直接传递值，
//把实参的值复制给形参

//2,如果方法的形参是对象，那么实参向形参传递参数的时，也是把值给形参，这是值是实参在栈内存的值，也就是引用对象在堆中的地址。
//基本数据类型都是保存在栈内存中，引用对象在栈内存中保存的是引用对象的地址。
//那么方法的参数传递是传递值（是变量在栈内存当中的值，基本数据 ）