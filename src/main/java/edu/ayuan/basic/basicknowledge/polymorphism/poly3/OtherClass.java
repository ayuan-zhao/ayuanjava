package edu.ayuan.basic.basicknowledge.polymorphism.poly3;

public class OtherClass {

    public static void otherAPI(Vehicle vehicle) {
        System.out.println("vehicle info: " + vehicle.getInfo());
        vehicle.run();
    }
}
