package edu.ayuan.basic.model.oopLearning;

//顺序很重要，先Peson6,PublicString name定义 写在public Person(){}的外面，但是赋值在里边
public class Person6 {
    public Person6(int a, String n) {
        //String name = "Afra";
        age = a;
        name = n;
    }

    public int age;
    public String name;

    //把 name 和 age 在new的时候初始化
}
