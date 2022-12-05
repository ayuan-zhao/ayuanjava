package edu.ayuan.basic.basicknowledge.learnclass.laioffercar;

public class LearnClass {

    public int age;//member filed
    private final String name;//constant fileld一旦赋值，不可改变
    private static String school;//static filed,属于school的类，公有的性质
    private static final String GREETINGS = "Hello"; //static constant filed

    public LearnClass(String name) {//constrctor,new的时候会调用constrctor
        this.name = name;//name = n
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//(member)method,getter,accessor
        this.age = age;
    }
//Primitive type vs class Type
    /*
    除了八种基础数据类型，剩下都是class 类型

   成员变量member variale 存在heap上
   本地变量local variable 存在stack 上

   Constructor：
   1.名字和类相同
   2.以大写字母开头（因为和类名相同）
   3.没有return type、
   目的 :构造对象的时候，初始化一些特质When constructing an object, initialize some properties

     */
//    this,当前的对象。firstStudent.setAge, this.age,这个this,就指的是当前的firstStudent,this,就是谁.setName
    /*
    public class Student{
        String name;
         void setName(String name){
//         如果 referenceariable 和 input parameter 重名，默认是input parameter
            如果想指 String name;需要➕ this.
            this.name = name;//shadows a field
            }
            如果不重名
         String name;
         void setName(String n){
            name = n;//shadows a field
         }
       s.setName("Tom")
     */

//    visibil public private,protect,default
//    static,可以修饰 filed,或者method,属于整个类，不是属于一个具体的对象
//    displayManufacture,显示制造商，属于整个类，是 static的方法。display Welcom，谁买的就欢迎谁，谁调用的，就不是static
//为啥 non static的方法，既可以调用static的变量，又可以调用non static的变量
//   static 方法不能直接访问，non static filed.如果要访问 nonstatic 变量，因为不知道  因为 非static 需要一个context 需要一个object,static
//tsmdls.displayWelcome();
//    non
//    non static method 一定要通过reference去调用，如果通过类去调，是编译错误
//    static method，通过类去调用
//    laModelS.displayManufacture();

//    static 方法可以直接调用
//    non static,需要object reference 调用


}
