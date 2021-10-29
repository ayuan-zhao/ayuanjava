package edu.ayuan.basic.basicknowledge.polymorphism.poly12;
//方法的形式参数，如果是类名，其实需要的是该类的对象
//方法的返回值是类名，其实返回的是该类的对象
public class CatDemo {

    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        CatOperator co = new CatOperator();
        Cat c = new Cat();//在main类里新建对象
        co.useCat(c);//因为useCat方法在CatOperator类，所以需要用new 一个CatOperator的对象，然后给useCat传值

        Cat c2 = co.getCat();//new Cat
        c2.eat();
    }

}
