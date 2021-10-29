package edu.ayuan.basic.basicknowledge.polymorphism.poly9;

import java.sql.SQLOutput;

public class Dog extends Animal implements IAction {

    public Dog(){

    }

    public Dog(String name, int age) {
        super(name, age);//这个不能少

    }


    @Override
    public void Jumpping() {
        System.out.println("勾勾也会跳高哦");
    }

    @Override
    public void eat() {
        System.out.println("狗狗只爱吃肉骨头");
    }
}
