package edu.ayuan.basic.basicknowledge.polymorphism.poly9;

public class JumppingDemo {

    public static void main(String[] args) {

//        IAction j = new Cat();
//        j.Jumpping();
        Animal a = new Cat();
        a.name = "喵喵";
        a.age = 2;
        a.eat();
        System.out.println(a.getName() + " 已经 " + a.getAge() + "岁了");
        a.eat();
        Cat c = new Cat();
        c.Jumpping();
//((cat)a).jumping();
        Animal b = new Dog("旺财", 4);
        b.eat();
        Dog d = new Dog();
        System.out.println(b.getName() + " 已经 " + b.getAge() + "岁了");
        d.Jumpping();
        d.eat();

//        IAction j2 = new Dog();
//
//a=new Cat()
    }
}