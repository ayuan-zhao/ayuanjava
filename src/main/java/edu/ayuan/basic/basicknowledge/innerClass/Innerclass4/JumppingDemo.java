package edu.ayuan.basic.basicknowledge.innerClass.Innerclass4;

public class JumppingDemo {

    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调method方法
        JumppingOperator jo = new JumppingOperator();//main类里新建的是operator的对象，不是接口的对
        IAction j = new Cat();//必须要在猫类里写上 Cat implements IAction
        jo.method(j);//需要填的是实现类对象

        IAction j2 =new Dog();
        jo.method(j2);
        System.out.println("*******匿名内部类的改进方法**********");

        jo.method(new IAction() {//要的是一个接口，或者说该接口的实现类对象，匿名内部类的本质是一个对象
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");

            }
        });

        jo.method(new IAction() {
            @Override
            public void jump() {
                System.out.println("勾勾也可以跳高写在匿名类里，就不需要多写一些类，特别是如果cat类和dog类复用率比较低");
            }
        });

    }

}
