package edu.ayuan.basic.basicknowledge.polymorphism.poly11;

public class BasketballCoach extends Coach {


    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃工作餐");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教流川枫运球和传球");
    }
}
