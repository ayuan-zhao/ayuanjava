package edu.ayuan.basic.basicknowledge.polymorphism.poly6Abstract;
//抽象类
public abstract class Animal {
   /*
    //不应该给出具体的实现
     public void eat(){
        System.out.println("吃东西");
    }
    */
//抽象方法
    public abstract void eat();//抽象方法必须在抽象类里
    public void sleep(){
        System.out.println("睡觉");
    }

}
