package edu.ayuan.basic.basicknowledge.polymorphism.poly1;

public class Cat extends Animal{
    public int age =20;
    public int weight =10;

    @Override
    public void eat() {
//        super.eat();重写的时候要去掉原来的
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫捉迷藏");
    }
}
