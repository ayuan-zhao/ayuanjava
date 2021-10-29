package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

//构造方法，无参，带参，成员方法：教
public abstract class Athletes extends Person {

    public Athletes() {
    }

    public Athletes(String name, int age) {
        super(name, age);
    }
    public abstract void learn();//记住运动员是一个抽象的类，要具体到什么运动员学什么，不要定义

//    @Override//不在这定义吃
//    public void eat() {
//        System.out.println("运动员吃的得健康");;
//    }
}
