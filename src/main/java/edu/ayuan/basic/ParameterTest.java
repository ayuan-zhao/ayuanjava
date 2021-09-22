package edu.ayuan.basic;

import edu.ayuan.basic.model.Person;

public class ParameterTest {
    public static void main(String[] args) {
        // 1. test primary type
        testPrimeType();

        // 2. test object
        testPerson();
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
