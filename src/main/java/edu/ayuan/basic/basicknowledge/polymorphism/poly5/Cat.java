package edu.ayuan.basic.basicknowledge.polymorphism.poly5;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("喵喵吃鱼鱼");
    }
}
