package edu.ayuan.basic.basicknowledge.polymorphism.poly12;

public class CatOperator {


    //这是用类作为形参
    public void useCat(Cat c){//传一个对象给这个方法//Cat c =new Cat();这个在main函数里new对象
        c.eat();
    }



    //这个是用类名作为返回值
    public Cat getCat(){//返回一个Cat 类型额数据，Cat类型的数据，就是Cat的对象。所以要new一个对象
        Cat c =new Cat();
        return c;

    }

}
