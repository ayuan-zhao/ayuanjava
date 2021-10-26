package edu.ayuan.basic.basicknowledge.polymorphism.poly2;

public class Dog extends Animal{

    @Override
    public void eat() {
//        super.eat();
        System.out.println("勾勾吃骨头");
    }
    public void lookdoor(){
        System.out.println("狗狗看门门");
    }
}
