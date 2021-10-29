package edu.ayuan.basic.basicknowledge.polymorphism.poly8;

import com.sun.codemodel.internal.JMethod;

/*
接口名+ Impl就说明是接口的实现类

*****Class Object
类 object是类层次的根，每个类都有object作为超类，所有对象（包括数组）都实现了这个类的方法
如果一个类没有父类，那么Object就是它的父类

如果一个类有父类，那么它就是间接的继承object类
 */
public class InterImpl implements Inter {
//    public class InterImpl extends Object implements Inter
    public InterImpl (){
        super();
    }


    @Override
    public void mthod() {
        System.out.println("method");

    }

    @Override//在implement类里重写这个方法
    public void show() {

    }
}



