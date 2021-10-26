package edu.ayuan.basic.basicknowledge.polymorphism.poly5;

/*
测试类
 */
public class AnimalDemo {

    public static void main(String[] args) {
//        创建猫类，进行测试
        Animal a = new Cat();
        a.setName("橘猫");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        Animal d = new Dog();
        d.setName("大黄");
        d.setAge(3);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();

        d = new Dog("小黑",2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
    }


}
