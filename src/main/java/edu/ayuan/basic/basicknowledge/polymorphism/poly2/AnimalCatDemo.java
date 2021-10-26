package edu.ayuan.basic.basicknowledge.polymorphism.poly2;
/*
测试类
多态的好处：提高了程序的扩展性
具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作
多态的弊端：不能使用子类特有的功能

 */
public class AnimalCatDemo {

    public static void main(String[] args) {
//        创建动物操作类的对象， 调用方法
        AnimalCatOperator ao =new AnimalCatOperator();
        Cat c =new Cat();
        ao.useAnimal(c);//相当于把Cat c =new Cat();传回AnimalCatOperator
        //在AnimalDemo创造了一个猫类型的变量就等同于
//        在AnimalOperator里创建了一个猫的对象，然后再调用Cat里面的方法

        Dog d =new Dog();
        ao.useAnimal(d);

        Pig p = new Pig();//每次加新的类，只需要在这里新建对象，调operator 里useAnimal的a.eat方法，提高程序扩展性
        ao.useAnimal(p);



    }



}
