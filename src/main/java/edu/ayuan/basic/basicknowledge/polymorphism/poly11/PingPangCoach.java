package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

public class PingPangCoach extends Coach implements IAction {


    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教马龙打乒乓球");

    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃外卖");
    }

    public void learningEnglish() {
        System.out.println("乒乓球教练需要学英语");
    }

}
