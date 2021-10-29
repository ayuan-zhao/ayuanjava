package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

public abstract class Coach extends Person implements IAction {


    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }


    public void teach() {

    }

}
