package edu.ayuan.basic.basicknowledge.polymorphism.poly7Interface;

public abstract class Animal {
    private int age =20;
    private final String city ="北京";//  常量

    public Animal (){//abstract 类不可以实例话，但是可以用多态的方式实例话，可以有构造方法的使用，就是子类访问父类数据的初始化
    }

    public Animal(int age){

        this.age =age;

    }

    public void show(){
        age = 40;
        System.out.println(age);
//        city= "上海"
        System.out.println(city);
    }
    public abstract void eat();



}
