package edu.ayuan.basic.basicknowledge.polymorphism.poly3;

public class Car extends Vehicle {

    public Car(int _id) {
        this.type = "Car";
        this.id = _id;
    }

    @Override
    public void run() {
        System.out.println("Car is NOT running");
    }

    @Override
    public String getInfo() {
//        return "this is a Car, " + super.getInfo();
        return "this is a Car, " + this.type;
    }
}
