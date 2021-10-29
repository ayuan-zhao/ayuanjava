package edu.ayuan.basic.basicknowledge.polymorphism.poly13;
/*
方法的形参是抽象类名，其实需要的是该抽象类的子类对象
方法的返回值是抽象类型，其实返回的是该抽象类额子类对象
 */
public class AnimalDemo {

    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.useAnimal(a);

        Animal a2 = ao.getAnimal();//Animal a2 =new Cat90
        a2.eat();

    }

}
