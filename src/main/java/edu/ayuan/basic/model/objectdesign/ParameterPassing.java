package edu.ayuan.basic.model.objectdesign;

//对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
//两个方法中定义的number都是局部变量（Local variable），两个number 虽然都是int number ,但是没关联
//没有数据接收，虽然在方法中变了，但是没有将改变的值赋给number,所有实参不变。
//一个实参的值传递给某个方法的形参的时候，传入的并非是本体，而是将一个副本传入进去，副本的值更改，不影响本体
public class ParameterPassing {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("before passing" + number);
        change(number);
        System.out.println("after call" + number);
    }

    //形参是方法调用时开辟的，它的作用域只是包含它的方法体，方法调用后形参就被释放了
    public static void change(int number) {
        number = 200;

    }
}
