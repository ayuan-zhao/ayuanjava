package edu.ayuan.basic.basicknowledge.learnclass.laioffercar;
//
public class Test {

    public static void main(String[] args) {
//        等号左边，叫 reference,引用变量，像一个明星片，等号右边叫object
        Car car = new Car(1234567);
//        car，car只有一个Car object，他们指向同一个object，这样赋值只是名片的拷贝，
        Car car2  = car;
        System.out.println("vin number");
        System.out.println(car.getVin());
//      这个本身是调用成员变量，但是因为 变量vin是private的，所以不可以
//        System.out.println(car.vin);
        System.out.println();

        System.out.println("the current speed of the give car objext is: ");
//      对象调用
        System.out.println(car.getSpeed());
        System.out.println();
        System.out.println("Now we increase the speed of this car by 300.");
        car.accelerate(300);
        System.out.println("The current speed of the give car object is");
        System.out.println(car.getSpeed());
        System.out.println();
//        TeslaModels car1 = new TelsaModels("jerry",99);

        }

}
