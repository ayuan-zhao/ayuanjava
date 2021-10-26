package edu.ayuan.basic.basicknowledge.polymorphism.poly3;

public abstract class Vehicle {

    protected String type;
    protected int id;

//    public void run() {
//        System.out.println("Vehicle is running!");
//    }
    // abstract method must be overrided.
    public abstract void run();

    public String getInfo() {
        return String.format("id:%s, type:%s", id, type);
    }
}
