package edu.ayuan.basic.basicknowledge.inherientance.person;

public class Student extends Person{
//    不要重复name和age的字段方法，只要新增score
//    子类自动获得了父类的所有字段，严禁定义与父类重名的字段！
    protected int score;
//    Student不能继承book但是可以has book,即使用组合，使student 持有一个book实例
    protected Book book;

    public Student(String x, int a, int G) {
        super();
    }
//父类：super class, parent class,base class
//子类： subclass, extended class

    public int getScore(){
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public String hello(){
        return "hello" + "I'm " +  this.age  +  "years old";
//        可以用 super.name, this.name,name,编译器会自动定位到父类的name字段
//        但是某些情况必须用super
//        详情见 class Main

    }


}
