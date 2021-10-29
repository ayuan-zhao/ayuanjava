package edu.ayuan.basic.basicknowledge.polymorphism.poly13;

public class AnimalOperator {

    public void useAnimal(Animal a) {//抽象类名做为参数，需要新建一个对象//Animal a = new Cat();
        a.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }


}
