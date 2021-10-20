package edu.ayuan.basic.inherientance.father;

/**
 * 继承是面向对象三大特征之一，可以使得子类具有父类的属性和方法，还可以在子类中重新定义，追加属性和方法 格式：public class 子类名 extends 父类名{},前面类继承后面的类 parent
 * class/superclass 父类,subclass子类，extends class子类 继承的好处： 提高了代码的复用性（多个类相同的成员可以放到同一个类中） Improved code
 * reusability (the same members of multiple classes can be placed in the same class)
 * 提高了代码的维护性（如果方法的代码需要修改，修改一处即可）Improve the maintainability of the code (if the code of the method needs to be
 * modified, just modify one place)
 *
 * 继承的弊端： 继承让类与类之间产生了关系，类的耦合性增强了，当父类发生变化时，子类实现也不得不跟着变化，削弱了子类的独立性 Inheritance creates a relationship between
 * the class and the class, and the coupling of the class is enhanced. When the parent class changes, the
 * subclass implementation has to follow the change, which weakens the independence of the subclass
 *
 * 什么时候使用继承： 继承体现的关系： is a 假设法：我有两个类A和B,如果他们满足A是B的一种，或者B是A的一种，就说明他们存在继承关系， 不能滥用继承 举例：苹果和水果是，猫和动物是，猫和狗不是
 *
 * 特点： 子类中所有的构造方法默认都会访问父类中无参构造方法 为什么呢： 因为子类会继承父类的数据，可能还会使用父类的数据，所以，子类初始化之前，一定要先完成父类数据的初始化
 * 每一个子类的构造方法的第一条语句默认都是：super() super.show访问父类的show,然后调用子类的show
 *
 * 通过子类的对象访问一个方法 先在子类范围内找，然后在父类范围内找，如果都没有就报错
 *
 * Zi z = new Zi(); new就会申请地址(会在堆内存生成一个地址，）会进行父类数据的初始化，就是把public int age =40的数据也存在堆里
 * 接着会调子类的构造方法，调用子类的构造方法，默认会访问父类的构造方法super();子类初始化的数据会进入堆内存中（public int age = 20;） 方法内的变量存在栈内存里，成员变量存在堆内存里？
 *
 * 父类的无参构造方法 子类的无参构造方法， 子类的show方法（）子类有show方法，还会调用父类的show方法吗？不会了，只调用子类的了，方法的重写 父类的show方法（）
 *
 *
 * main方法，构造方法，都是加载到栈内存里
 *
 * 父类中的 private方法，子类是不能重写的，私有方法不能被重写，子类不能继承父类的私有变量，但可以通过父类的公共方法访问私有变量
 * 子类的访问权限必须 等于/大于父类（public>默认default>私有private）
*/


public class inherientanceDemo {

    public static void main(String[] args) {
//        创建对象，调用方法
        Father f = new Father();
        f.showf();

        Son s = new Son();
        s.shows();
//        在子类里写了 public class Son extends Father,所以子类也可以调用父类了
        s.showf();

    }


}
