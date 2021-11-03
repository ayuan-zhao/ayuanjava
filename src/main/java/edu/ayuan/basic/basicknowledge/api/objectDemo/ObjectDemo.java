package edu.ayuan.basic.basicknowledge.api.objectDemo;

import java.sql.SQLOutput;

/*
public boolean equals(Object obj):指示一些其他对象是否等于此
 */
public class ObjectDemo {

    public static void main(String[] args) {
//        Student s =new Student();
//        s.setName("霞霞");
//        s.setAge(30);
//        System.out.println(s);
//        System.out.println(s.toString());//默认底层的to dtring方法在构造里重写
////        tostring 返回对象的字符串表示形式，一般来说，toString 方法返回一个"toString"代表这个对象的字符串。
////         建议子类重写此方法，自动生成
//

        Student s1 = new Student();
        s1.setName("青霞");
        s1.setAge(30);

        Student s2 = new Student();
        s2.setName("袁咏仪");
        s2.setAge(40);

//        比较两个对象的内容是否相同
        System.out.println(s1 == s2);
//          比较的是地址值
        System.out.println(s1.equals(s2));


        /*
         public boolean equals(Object obj) {
         //this——————s1
         //obj ______s2

     谁调用这个方法，谁就是this

        return (this == obj);//比较的是地址值
         */

    }

    public boolean equals(java.lang.Object obj) {
        return (this == obj);
    }
}




