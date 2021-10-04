package edu.ayuan.basic.model.oopLearning;

public class StudentDemo {

    public static void main(String[] args) {
        //创建对象
        Student s = new Student();
        //main方法 Student s在栈内存里开辟空间
        //默认Student 的值是name:null,age:0,存在堆内存里
        //使用对象
//        System.out.println(s.name + "," + s.age);
        //通过栈内存访问堆内存地址值——null,0
        //修改堆里的内存为"linqingxia，30
//        s.name = "linqingxia";
//        s.age = 30;
//        s.setAge(-30);//在setAge方法里可以设定条件
        s.setAge(-30);
        s.setName("xiaxia");
        s.getName();
        s.getAge();
        s.showAge();
        Student s2 =new Student();
        s2.setName("zhangmanyu");
//        System.out.println(s.name + "," + s.age);
//使用成员方法
//        调这个方法时，这个方法加载到栈内存

        s.study();
//        当这个方法执行完毕，它就会从栈内存消失
//        调这个方法时，这个方法加载到栈内存
        s.doHomework();
        //        当这个方法执行完毕，它就会从栈内存消失
//        这个时候，main方法执行完毕，会从栈内存消失

//        不同调用者，调用同一个方法时，在堆内存中显示的不一样，
//        例如，第一次调用的时候，调用者是s1，调用堆内存的地址是001，第二次调用，调用者是S2，调用堆内存的地址是002
    }

}
