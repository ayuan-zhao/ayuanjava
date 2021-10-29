package edu.ayuan.basic.basicknowledge.polymorphism.poly14;
/*
抽象类是用来捕捉子类的通用特性的，而接口则是抽象方法的集合
抽象类不能被实例化，只能被用做子类的超类，是被用来创建继承层级里子类的模版
而接口只是一种形式，接口自身不能做任何事情

方法的形式参数是接口名，其实需要的是该接口的实现类对象
方法的返回值是接口名，其实返回的是该接口的实现类对象
 */
import edu.ayuan.basic.basicknowledge.polymorphism.poly7Interface.Jumpping;

public class JumppingDemo {

    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        IAction j = new Cat();//新建了一个Cat类来实现接口
        jo.useJumpping(j);


        IAction j2 = jo.getJumpping();//返回了一个new cat(),多态形式调接口
        j2.Jumpping();

    }

}
