package edu.ayuan.basic.objectdesign;

import edu.ayuan.basic.model.Person;

public class ModelTest {
    public static void main(String[] args) {
        testPerson();
    }

    private static void testPerson() {
        Person person1 = new Person();
        Person person2 = new Person();

        person1.setName("Amy");
        person2.setName("Baby");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}
