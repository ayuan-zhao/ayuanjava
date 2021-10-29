package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

public class PingPangAtheletes extends Athletes implements IAction{


    public PingPangAtheletes() {
    }

    public PingPangAtheletes(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("乒乓球运动员需要学习发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员需要吃的很营养");
    }

    @Override
    public void learningEnglish() {
        System.out.println("乒乓球运动员需要好好学英语");
    }
}
