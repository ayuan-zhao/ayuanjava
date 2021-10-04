package edu.ayuan.basic.methods.constructionMethod;

/**
 * 构造方法是一种特殊的方法 public class 类名{ 修饰符 类名（参数）{
 *
 * } } 作用：创建对象 功能，主要是完成对象数据的初始化，成员变量的默认值之类的 public class Student{ public Studeent(){ //构造方法内书写的内容 } }
 * 每一个构造方法，都要对应的创建一个对象 注意事项： 1.如果没有定义构造方法，系统将给出一个默认的无参数构造方法 2.如果定义了构造方法，系统将不再提供默认的构造方法
 * 如果自定义了带参构造方法，还要使用无参构造方法，就必须再写一个无参数构造方法 *****无论是否使用，否建议手工书写无参数构造方法
 */
public class Student {

    private String name;
    private int age;


    //    public Student() {
//        System.out.println("无参构造方法");
//    构造方法
    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //    成员方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    }

