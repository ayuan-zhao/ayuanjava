package edu.ayuan.basic.basicknowledge.polymorphism.poly6Abstract;

public class AnimalDemo {

    public static void main(String[] args) {
        //如果是抽象类的话，是不能创建对象的public abstract class Animal
//        Animal a = new Animal();
        Animal a = new Cat();
//        编译看左边，执行看右边，左边有，右边执行
        a.eat();
        a.sleep();
    }

}
