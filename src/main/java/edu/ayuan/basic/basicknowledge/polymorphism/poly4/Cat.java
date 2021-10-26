package edu.ayuan.basic.basicknowledge.polymorphism.poly4;

public class Cat extends Animal{

    @Override
    public void eat() {
//        super.eat();
        System.out.println("喵喵吃鱼鱼");
    }
    public void playGame(){
        System.out.println("喵喵吃完玩鱼鱼");
    }
}
