package edu.ayuan.basic.objectdesign;

import edu.ayuan.basic.model.Person;
import edu.ayuan.basic.model.Ren;

public class ParameterTest {
    public static void main(String[] args) {
        // 1. test primary type
        // testPrimeType();

        // 2. test object
        //  testPerson();
        // testPerson2();

        //testPerson3();
    }

    private static void testPerson3() {
        Ren p = new Ren();
//        p.age = 20;
        p.setAge(20);
//        p.address = "132 dixon lading";
        p.setAddress("132 dixon lading");
//        p.name = "John";
        p.setName("John");
//        changePerson(p);
        System.out.println(p.getAddress());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

    private static void testPerson2() {
        Person p = new Person();
        p.age = 20;
        p.address = "132 dixon lading";
        p.name = "John";
        changePerson(p);
        System.out.println(p.address);
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p);
    }

    private static void changePerson(Person p) {
        p.age = 30;
        p.address = "122 dixon lading";
        p.name = "John Smith";
    }


    private static void testPerson() {
        Person p = new Person();
        p.setName("Peter");
        p.setAge(30);
        change(p);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

    private static void change(Person p) {
        p.setName("Qi");
        p.setAge(31);
    }

    private static void testPrimeType() {
        int a = 3;
        String str = "xyz";
        change(a, str);
        System.out.println(a);
        System.out.println(str);
    }

    private static void change(int a, String str) {
        a = 4;
        str = "abc";
    }
}
