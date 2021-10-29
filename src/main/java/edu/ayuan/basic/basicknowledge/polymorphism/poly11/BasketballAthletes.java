package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

public class BasketballAthletes extends Athletes {


    public BasketballAthletes() {
    }

    public BasketballAthletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员需要吃的非常营养");
    }

    @Override
    public void learn() {
        System.out.println("篮球运动员需要学习科学文化知识");
    }
}
