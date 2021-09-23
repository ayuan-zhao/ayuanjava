package edu.ayuan.basic.model.test;

import edu.ayuan.basic.model.Person3Print;
//可变参数variable parameter,参数类型是可变，多个的

//java 里方法的参数传递方式只有一种：值传递

public class VariableParameter {
    public static void main(String[] args) {
        Person3Print p3 = new Person3Print();
        //声明了一个p3 的变量，初始化一个对象给p3
        //在堆heap中声明了一个对象
        //stack中存new的对象在堆中的地址，栈像电话簿
        //方法的参数部分有可变形参，放在形参声明的最后{ }
        String[] info1 = new String[]{"zhangsan", "11"};
        p3.printinfo(info1);

        String[] info2 = new String[]{"Beijing", "18600649068", "3207xxxxx"};
        p3.printinfo(info2);
        //printInfo1()这是只运行info1, p3.printInfo1(info2);运行info1和info2

        p3.printInfo1("lily","23","male");
        String[] ss2 = new String[]{"shanghai","15932xxxx","32070319xxxxx"};
        p3.printInfo1(ss2);


    }
}
