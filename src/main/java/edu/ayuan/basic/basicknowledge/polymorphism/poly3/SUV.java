package edu.ayuan.basic.basicknowledge.polymorphism.poly3;

public class SUV extends Vehicle {

    public SUV(int _id) {
        this.type = "SUV";
        this.id = _id;
    }

    @Override
    public void run() {
        System.out.println("SUV is running");
    }

    @Override
    public String getInfo() {
        return "this is a SUV," + super.getInfo();
    }
}
