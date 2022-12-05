package edu.ayuan.basic.basicknowledge.learnclass.laioffercar;

public class Student {

    public int age;//member filed
    private final String name;//constant fileld一旦赋值，不可改变
    private static String school;//static filed,属于school的类，公有的性质
    private static final String GREETINGS = "Hello"; //static constant filed

    public Student(String name) {//constrctor,new的时候会调用constrctor
        this.name = name;//name = n
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//(member)method,getter,accessor
        this.age = age;
    }

    public void sayHello() {//member method
           System.out.println(GREETINGS +" ! I am " + name + "I am" + age);
    }
    public static void welcome(){//这个函数属于这个类全体，不是属于某个对象

    }

}

