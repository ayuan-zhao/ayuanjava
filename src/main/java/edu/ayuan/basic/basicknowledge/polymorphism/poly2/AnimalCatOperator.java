package edu.ayuan.basic.basicknowledge.polymorphism.poly2;
//父类提供一个默认值，如果子类缺省，默认调用父类的方法，如果子类有自己的同名方法，优先调用子类
//多态只能访问共有的方法
public class AnimalCatOperator {

    /*
    public void useAnimal(Cat c){
        c.eat();
    }

    public void useAnimal(Dog d){//Dog d = new doa();
        d.eat();
    }

     */
    public void useAnimal(Animal a){
        a.eat();//都继承于annimal，所以可以直接传父类，调用的时候在Demo类：
//      "  AnimalCatOperator ao =new AnimalCatOperator();//先创建operator对象，
//        Cat c =new Cat();//再创建猫类的对象
//        ao.useAnimal(c);"//调用了useanimal方法，传入了参数，c——cat

//        相当于 Animal a = new cat();
//        Animal a = new dag();
//        提取了共性就可以省去重复创造
//       a.lookdoor//(会报错)多态不能用Animal的对象直接访问子类特有的功能

    }
}
