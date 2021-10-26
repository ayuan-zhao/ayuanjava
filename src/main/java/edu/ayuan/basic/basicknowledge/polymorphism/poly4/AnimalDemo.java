package edu.ayuan.basic.basicknowledge.polymorphism.poly4;

/*
多态中的转型TransformationPolymorphism
向上转型up-casting，
从子到父
父类引用指向子类对象

向下转型
从父到子
父类引用转为子类对象
 */
public class AnimalDemo {

    public static void main(String[] args) {
//        多态
        Animal a = new Cat();//父类引用指向子类对象，向上转型up-casting
        a.eat();
//        a.playGame//编译看左边，左边没有这样一个a里没有一个playGame的方法
       /*
        Cat c = new Cat();
        c.eat();
        c.playGame();

        */

//        向下转型，为普通的继承关系
        Cat c =(Cat)a;
        ((Cat) c).playGame();
//        Cat c =(Cat)a;
//        c.eat();
//        c.playGame();
    }


}



