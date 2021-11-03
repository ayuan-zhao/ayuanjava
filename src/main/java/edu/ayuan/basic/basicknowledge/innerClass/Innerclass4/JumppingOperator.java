package edu.ayuan.basic.basicknowledge.innerClass.Innerclass4;
/*
接口操作类，里面有一个方法，方法的参数是接口名
 */
public class JumppingOperator {
    public void method(IAction j ){//建一个method,然后把接口的对象传进去,//new cat,//new Dog
        j.jump();
    }

}
