package edu.ayuan.basic.basicknowledge.polymorphism.poly5;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println("勾勾吃骨头");

    }
}
