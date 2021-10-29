package edu.ayuan.basic.basicknowledge.polymorphism.poly9;

public abstract class Animal {


    public String name;
    public int age;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//public abstract void eat(){}
    public  void eat() {
        System.out.println("动物们都要吃饭饭");
    }
}
