package edu.ayuan.basic.basicknowledge.learnclass.laioffercar;
//整数初始值，默认0，bool默认false
public class Car {
//   成员变量一般都设置成private,方法设置成public
    private int vin;
    private int speed;//invariant:speed should always >= 0
    // 没有返回值，但是也没有void,因为这是构造函数 constructor
//    会默认constructor，如果自己建的话，最好自己初始化一个值
    public Car(int vinNumber){
        vin = vinNumber;
        speed = 0;
    }
    public Car(int vinNumber, int initialSpeed){
        vin = vinNumber;
        if(initialSpeed >= 0) {
            speed = initialSpeed;
        }else{
            speed = 0;
        }

    }
    public void accelerate(int increment){
        if(increment < 0){
            return;

        }
        speed += increment;
    }

    public int getVin() {
        return vin;

    }
    public int getSpeed(){
        return speed;
    }
}
