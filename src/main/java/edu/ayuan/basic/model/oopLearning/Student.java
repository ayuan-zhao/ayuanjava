package edu.ayuan.basic.model.oopLearning;

//main 是程序入口，类不用？
//成员变量,在public class Student {这个花括号内的，方法以外的变量，是成员变量，类中，方法外，哪怕写在方法之后，只要不在方法内，都是成员变量
public class Student {

    private String name;
    private int age;//private是保护成员不被别的类使用，被private修饰的成员只能在本类中才能被访问
    //this.age，是代表上面的age，成员变量
    public String course;
    public String hobby;

    //set方法，是有形参的，要输入一个值的
    public void setAge(int a) {
        // age = a;
        if (a < 0 || a > 120) {
            System.out.println("wrong age");
        } else {
            this.age = age;
        }
    }

    //    get方法 是有返回值类型的
    public int getAge() {
        return age;
    }

    //    方法中可以对参数进行判断
//     方法的形参如果和成员变量同名，不带this修饰的变量指的是形参，而不是成员变量。
//    方法的形参如果没有！与成员变量同名，不带this修饰的变量指的是成员变量
    public void setName(String name) {
//        name = name;虽然一个name是成员变量，一个name是局部变量，但是方法里识别不了,需要用this关键字
//        this.name指代的是成员变量
//        没有用this修饰的name是局部变量
        this.name = name;
//
        System.out.println(name);
    }

    public String getName() {

        return name;
    }
    //存在堆内存里,有初始化的默认值
//    随着对象的存在而存在，随着对象的消失而消失

    //成员方法
    public void study() {
        int a = 4;//这种变量叫做局部变量，因为它在方法内，或者方法声明上，存在栈内存里
//        没有默认的初始化值，必须先定义，赋值，才能使用
//        随着方法的调用而存在，随着方法调用完毕而消失
        System.out.println("好好学习，天天向上");
    }

    public void doHomework() {
        System.out.println("键盘敲烂，月薪过万");
    }

    public void showInfo() {
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("course " + course);
        System.out.println("hobby " + hobby);
    }

    public void showAge() {
        System.out.println(age);
    }
}
//对Private修饰的成员变量，如果要被其他类使用，
//1.提供"get变量名（）"方法，用于获取成员变量的值，方法用public修饰，
//2.提供"set变量名（参数）"方法，用于设置成员变量的值，方法用public修饰