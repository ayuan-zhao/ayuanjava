package edu.ayuan.basic.basicknowledge.inherientance.person;

public class Person {
//    private 方法，子类无法访问
//    protected方法，子类可以访问
    protected String name;
//    private int age;
    protected int age;
    protected int protectedName;

    public Person(String x, int i) {

    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){

    }

    public void setAge(int age) {
        this.age = age;
    }
}
