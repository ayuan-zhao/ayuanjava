package edu.ayuan.basic.methods.constructionMethod;

/**
 * 测试类
 */
public class StudentDemo {
    public static void main(String[] args) {
//        创建对象,必须有创建对象，才能有构造函数
        Student s1 = new Student();
        s1.setName("wangzuxian");
        s1.setAge(19);
        s1.show();
//       如果构造方法带一个String类型的参数，那创建对象的时候，后面必须要带参数
//        如果就想使用无参的，那么就要手动建立一个无参的构造方法
//       无参构造方法
        Student s2 = new Student("linqingxia");
        s2.show();
        Student s3 = new Student(30);
        s3.show();
        Student s4 =new Student("xiaxia",35);
        s4.show();

    }
}
