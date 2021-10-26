package edu.ayuan.basic.basicknowledge.polymorphism.poly3;

public class Vehiclemain {

    public static void main(String[] args) {

//        testVehicle();
//        testCar();
//        testSUV();
        Vehicle v1 = new Car(100);
        OtherClass.otherAPI(v1);
        OtherClass.otherAPI(new SUV(101));
    }

    private static void testSUV() {
        Vehicle suv = new SUV(456);
        // car is running
        suv.run();
        // this is a SUV, id, type
        System.out.println(suv.getInfo());
    }

    private static void testCar() {
        Vehicle car = new Car(345);
        // car is running
        car.run();
        // this is a car, id, type
        System.out.println(car.getInfo());
    }

    private static void testVehicle() {
//        Vehicle v = new Vehicle();
//        v.id = 123;
//        v.type = "unknown";
//        System.out.println(v.getInfo());
//        v.run();
    }
}
