package edu.ayuan.basic.basicknowledge.inherientance.upcasting;


public class Main {

    public static void main(String[] args) {
        Student s = new Student("xiao ming", 12, 89);
        Person p = new Person();
//        Person是Person类型的变量， Student是student类型的实例
//        子类转型成父类类型的赋值，向上转型（upcasting）
        Person up = new Student();
        Student st = new Student();
        Person pe = st;
        Object o1 = p;
        Object o2 = s;

//        downcasting
        Person p1 = new Student();
        Person p2 = new Person();
//        可以成功，因为p1确实指向 Student实例
        Student s1 = (Student) p1;
//        classCastException,P2的类型，实际上是Person,不能把父类变为子类，因为子类功能比父类多，多的功能无法凭空变出来
//        Student s2 = (Student) p2;

        Person p3 = new Person();
//        判断是不是这个类型。为了避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型：
        System.out.println(p2 instanceof Person);
        System.out.println(p3 instanceof Student);

        Person p4 = new Student();
        if (p4 instanceof Student){
            Student s4 = (Student) p4;
            System.out.println("p4 true");
        }


    }

}

