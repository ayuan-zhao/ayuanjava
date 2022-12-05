package edu.ayuan.basic.basicknowledge.laiofferdataStrcture.hashCode;

/**
 * 同一个对象多次调用hashCode()方法返回的哈希值是相同的
 * 默认情况下，不同对象的哈希值是不同的，而重写hashCode()方法，可以实现让不同对象的返回的哈希值是相同的
 */
public class HashCodeDemo {

    public static void main(String[] args) {
        //创建学生对象
        Student s1 = new Student("qingxia",20);
        //同一个对象多次调用个hashCode方法，返回的哈希值是相同的
        System.out.println(s1.hashCode());//21685669
        System.out.println(s1.hashCode());
        System.out.println("***********************");

        Student s2 = new Student("qingxia",30);
//        默认情况下，不同对象的哈希值是不相同的
//        通过方法重写，可以实现不同对象的哈希值是相同的
        System.out.println(s2.hashCode());///2133927002
        System.out.println("***********************");
        System.out.println("hello".hashCode());//99162322
        System.out.println("world".hashCode());//113318802
        System.out.println("java".hashCode());//3254818
        System.out.println("world".hashCode());//113318802
        System.out.println("***********************");
        System.out.println("重地".hashCode());//1179395
        System.out.println("种地".hashCode());//988931
        System.out.println("通话".hashCode());//1179395
        System.out.println("tonghua".hashCode());//-1141160192




    }

}
