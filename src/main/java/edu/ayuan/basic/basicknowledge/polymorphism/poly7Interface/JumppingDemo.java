package edu.ayuan.basic.basicknowledge.polymorphism.poly7Interface;
/*

interface接口
接口就是一种公共的规范标准，只要符合规范标准，大家都可以通用
java中的接口更多体现在对行为的抽象

多态的形式：具体类多态，抽象类多态，接口多态
 */

public class JumppingDemo {

    public static void main(String[] args) {
//        Jumpping j = new Jumpping() {接口不能被实例话
         Jumpping j = new Cat();
         j.jump();


            }
        }
