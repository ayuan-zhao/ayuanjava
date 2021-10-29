package edu.ayuan.basic.basicknowledge.polymorphism.poly10;
/*
一个类，实现多个接口
//接口弥补了Java类不能多继承的缺点
接口和接口是继承关系，并且可以多继承

抽象类和接口的区别：
成员区别：
抽象类：变量，常量，有构造方法，有抽象方法，也有非抽象方法
接口： 常量，抽象方法

关系区别：
类与类：  继承，单继承
类与接口： 实现，可以单实现，也可以多实现

接口与接口：  继承，单继承，多继承

*******设计理念区别********
抽象类： 对类抽象，包括属性，行为
接口  对行为抽象，主要是行为

门和警报的例子

门：都有open（）和close()两个动作，这个时候，我门可以分别使用抽象和接口来定义这个抽象概念
//抽象类：
public abstract class Door{
public abstract void open();
public abstract void close();
public abstract void alarm();

//报警属于动作，不是门附属的，而是另外加上的，应该开关门作为抽象类，报警做接口
抽象类是对事物的抽象，接口是对行为的抽象

//接口类
public interface Door{
void open();
void close();
void alarm();//

 */
public class InterImpl extends Object implements Inter1,Inter2,Inter3 {

}
