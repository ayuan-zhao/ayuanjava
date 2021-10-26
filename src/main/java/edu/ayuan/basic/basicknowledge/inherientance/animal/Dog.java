package edu.ayuan.basic.basicknowledge.inherientance.animal;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void lookDoor(){
        System.out.println("watch for the door, waiting for master come home");

    }


}
