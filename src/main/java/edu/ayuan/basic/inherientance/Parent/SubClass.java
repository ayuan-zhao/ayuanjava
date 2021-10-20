package edu.ayuan.basic.inherientance.Parent;


import edu.ayuan.basic.inherientance.Parent.Parent;

public class SubClass extends Parent {

    /* 静态变量 */
    public static String s_StaticField = "子类--静态变量";
    /* 变量 */
    public String s_Field = "子类--变量";

    /* 静态初始化块 */
    static {
        System.out.println(s_StaticField);
        System.out.println("子类--静态初始化块");
    }

    /* 初始化块 */ {
        System.out.println(s_Field);
        System.out.println("子类--初始化块");
    }


    /* 构造器 */
    public SubClass() {
        System.out.println("子类--构造器");
        System.out.println("i=" + i + ",j=" + j);
    }

    public void shows() {
//        1.age虽然在父类里，但是子类也可以在方法里直接用
//        2.如果子类也设了一个成员变量flied，properties,打印出来就是子类的值
//        3.方法内如果有properties，就用方法内的
//        子类局部范围/方法>子类成员范围>父类成员范围，作用范围越小，权限越高。就近原则
        i =90;
        j =200;
        System.out.println("子类的其他方法");
        System.out.println("i是："+i +"， j是：" +j);


    }
}