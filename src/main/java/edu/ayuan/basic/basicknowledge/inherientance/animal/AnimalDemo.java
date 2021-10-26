package edu.ayuan.basic.basicknowledge.inherientance.animal;

public class AnimalDemo {

    public static void main(String[] args) {
//        创建猫类对象,进行测试
        Cat cat1 = new Cat();
        cat1.setAge(11);
        cat1.setName("miaomiao");
        System.out.println(cat1.getName() + "," + cat1.getAge());
        cat1.catchMOuse();

        Cat cat2 = new Cat();
        cat2.setAge(2);
        cat2.setName("加菲");
        System.out.println(cat2.getName()+ ","+cat2.getAge() );
        cat2.catchMOuse();

        Dog dog1 =new Dog();
        dog1.setName("gaofei");
        dog1.setAge(3);
        System.out.println(dog1.getName()+","+dog1.getAge());
        dog1.lookDoor();



    }
}