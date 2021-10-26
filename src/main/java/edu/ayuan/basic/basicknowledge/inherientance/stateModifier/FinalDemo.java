package edu.ayuan.basic.basicknowledge.inherientance.stateModifier;

/*
final修饰的是盒子
final 修饰基本类型，值不能变。
final修饰引用类型，地址值不能变，但是内容是可以变的
 */
public class FinalDemo {

    public static void main(String[] args) {
        //final 修饰基本类型变量,修饰完就不是变量而是常量了
//       final int age =20;
//        age = 100;
        int age = 30;
        System.out.println(age);

        //final 修饰引用类型变量
        final Student s = new Student();
        System.out.println(s.age);//这时候的值是basicknowledge里 student的值

//        如果s.age =100;输出结果就会变成100
        s.age = 100;
        System.out.println(s.age);


    }

}
