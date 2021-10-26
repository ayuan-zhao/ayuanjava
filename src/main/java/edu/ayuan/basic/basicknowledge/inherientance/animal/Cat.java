package edu.ayuan.basic.basicknowledge.inherientance.animal;

public class Cat extends Animal {

    public Cat(){

    }
    public Cat(String name,int age){
        super(name,age);

    }
public void catchMOuse(){
    System.out.println("猫抓老鼠");
}
}
