package edu.ayuan.basic.basicknowledge.polymorphism.poly9;

public class Cat extends Animal implements IAction{

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void Jumpping() {
        System.out.println("猫咪跳的可高啦");
    }

    public void eat() {
        System.out.println("小猫咪爱吃小鱼鱼");
    }
}
