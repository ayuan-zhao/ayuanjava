package edu.ayuan.basic.basicknowledge.innerClass.innerClass2;
/*
局部类只能在这个方法内部访问，
成员内部类，outer各个方法都可以访问

局部内部类是在方法中定义的类，所以外界是无法使用，需要在方法内部创建对象并使用
该类可以直接访问外部类的成员，也可以访问方法内部的局部变量
 */
public class Outer {

    private int num = 10;

    public void method() {//成员方法体内新建了一个内部类，要调用这个类里的方法，需要在外部类的方法内部 新建Inner的对象
        int num2 =20;
        class Inner {

            public void show() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
//在外部类使用内部类的方法，需要在方法内部 新建内部类的对象，然后用内部类的对象，调用内部类的方法
        Inner i = new Inner();//新建内部类的对象
        i.show();//调用内部类的方法

    }

}
