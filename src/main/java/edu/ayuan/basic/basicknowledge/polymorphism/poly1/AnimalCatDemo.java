package edu.ayuan.basic.basicknowledge.polymorphism.poly1;
/*
polumorphism多态
同一个对象，在不同时刻表现出来的不同的形态

举例：
猫是猫： Cat c = new cat();
猫是动物：animal =new Cat();
多态的前提和体现：
1.有继承/实现关系
2.有方法重写
3。有父类引用指向子类对象


多态中的成员变量和方法编译，运行都看左边，如果该方法被重写，则方法看重写

多态的时候访问成员变量，访问的是父类的，多态访问，运行，编译，都是看左边。




 */

public class AnimalCatDemo {

    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal a = new Cat();
        System.out.println(a.age);//输出的age是Animal里的age,不是cat里的age
//        System.out.println(a.weight);//虽然写在猫类里，a也是猫，但是编译是看左边的，a是父类，向上转型
        a.eat();
//        a.playGame;//纯写在Cat里的方法不能被多态调用，只能调用重写的。
    }


}
