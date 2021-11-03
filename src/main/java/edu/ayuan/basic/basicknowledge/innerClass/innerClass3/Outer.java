package edu.ayuan.basic.basicknowledge.innerClass.innerClass3;

/*
匿名内部类，比较常用
前提：存在一个类或者接口，这里的类可以是具体类也可以是抽象类
格式：
new 类名 或者接口名(){
        重写方法；
        };

new Inter(){//类名或接口名，new说明这个整体是一个对象，但是没有名字，所以叫匿名内部类
      public void show(){继承了前面的类或者一个接口
      }
 }
 本质是一个继承了该类，或者实现了该接口的子类匿名对象
 内部类的本质作用是把类的定义封装起来
 */
public class Outer {

    public void method() {
        /*
        new Inter() {//这其实是一个内部类，只不过这个对象没有名字
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };//分号写在内部类括号后面

         */
      /*  new Inter() {//这其实是一个内部类，也是一个实现了Inter接口的一个子类匿名对象，所以对象调方法只用在方法后加"."就可以了，再加分号
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();//对象调了show 方法

       */
        //   Inter的一个实现类对象。 使用多态的方式，赋值给这个接口
        //   相当于new一个接口，形成对象，然后重写方法，最后调用这个对象的方法，如果多次调用，

        Inter i = new Inter() {//这其实是一个内部类，也是一个实现了Inter接口的一个子类匿名对象，所以对象调方法只用在方法后加"."就可以了，再加分号
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
        i.show();//可以直接这样多次输出
    }//method方法的括号，这方法内部调show方法
}

