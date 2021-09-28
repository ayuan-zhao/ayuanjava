package edu.ayuan.basic.model.oopLearning;

/**
 *
 */
public class Animal {
    String name;
    int eyes;
    int legs;

    public void eat(String food){//String food 叫方法的参数
        System.out.println("this animal's food is "+food);

    }

    public void move(String movetype){
        System.out.println("this animal's move type is"+movetype);
        int i =0;//局部变量，方法内变量


    }
}
