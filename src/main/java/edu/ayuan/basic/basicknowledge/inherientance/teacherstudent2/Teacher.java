package edu.ayuan.basic.basicknowledge.inherientance.teacherstudent2;

public class Teacher extends Person {

    public Teacher(){

    }


    public Teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("教学相长，有教无类");
    }


}


