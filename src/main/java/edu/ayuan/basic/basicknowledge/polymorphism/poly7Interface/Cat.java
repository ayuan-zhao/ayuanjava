package edu.ayuan.basic.basicknowledge.polymorphism.poly7Interface;

public class Cat implements  Jumpping {//类和接口之间，不能用继承


    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }
}

