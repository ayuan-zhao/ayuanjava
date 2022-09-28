package edu.ayuan.basic.basicknowledge.inherientance.upcasting;

class Student extends Person {
    protected int score;

     public Student(String name, int age, int score){
//         调用父类的构造方法， Person(String, int)
//         如果父类没有默认的构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法。
//         子类不会继承父类的构造方法，子类的构造方法是编译器自动生成，不是继承的
         super(name, age);
         this.score = score;
     }

    public Student() {

    }

//    正常情况下，只要某个class没有final修饰符，那么任何类都可以从该class继承。


}
