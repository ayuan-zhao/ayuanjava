package edu.ayuan.basic.inherientance.Parent;

public class Parent {

    //所有static静态的东西都是跟着类走，其他变量跟着对象走
    /* 静态变量 */
    public static String p_StaticField = "父类--静态变量";
    /* 变量 */
    public String p_Field = "父类--变量";
    protected int i = 9;
    protected int j = 0;

    /* 静态初始化块 */
    static {
        System.out.println(p_StaticField);
        System.out.println("父类--静态初始化块");
    }

    /* 初始化块 */ {
        System.out.println(p_Field);
        System.out.println("父类--初始化块");
    }

    /* 构造器 */
    public Parent() {
        System.out.println("父类--构造器");
        System.out.println("i=" + i + ", j=" + j);
        j = 20;
    }

    public static void main(String[] args) {
        Parent p1 = new Parent();//3
        Parent p2 = new Parent();//2
        //1. parent no object,静态变量，静态初始化，
        //2, new parent() object变量，初始化块，构造函数
        //3. p1 is assigned，把变量赋值给P1
//        4.new parent()object变量，初始化块，构造函数(注意！！静态变量，静态初始化一个类只运行一次，new其他对象的时候就不再运行了。)
//        5.赋值，把变量赋值给P2
    }

    public void shows() {

        i =90000;
        j =200000;
        System.out.println("父类的其他方法");
        System.out.println(i+j);

    }
//        1.age虽然在父类里，但是子类也可以在方法里直接用
//        2.如果子类也设了一个成员变量flied，properties,打印出来就是子类的值
//        3.方法内如果有properties，就用方法内的
//        子类局部范围/方法>子类成员范围>父类成员范围，作用范围越小，权限越高。就近原则

}


