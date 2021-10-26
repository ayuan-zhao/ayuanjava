package edu.ayuan.basic.basicknowledge.inherientance.father;

public class Son extends Father {

    public int height = 175;
    public int age = 20;

    public Son() {

    }

    public void shows() {
//        1.age虽然在父类里，但是子类也可以在方法里直接用
//        2.如果子类也设了一个成员变量flied，properties,打印出来就是子类的值
//        3.方法内如果有properties，就用方法内的
//        子类局部范围/方法>子类成员范围>父类成员范围，作用范围越小，权限越高。就近原则
        int age = 30;
        System.out.println(age);
//        我要访问本类成员变量age

        System.out.println(height);
    }

    public Son(int age){
        super();//默认调用无参构造函数
        //或者调用父类的带参构造方法
        System.out.println("Zi 中带参构造方法被调用");
}

}
