package edu.ayuan.basic.model.oopLearning;

public class Teacher {

    public String name;
    public String profession;
    public String teachingCourse;
    public int teachingAge;
    public static String abc = "abc";




//public static void getTeacherInfo(){不能写static,否则属性也需要写Static
//    static 跟着类走，非static property成员函数，变量跟着对象走。
//    static 是先创建，先创建的可以用后创建的，
//    所以建一个Static的方法，输入
    public void getTeacherInfo() {
        System.out.println("name is " + name);
        System.out.println("profession is "+profession);
        System.out.println("teachingCourse is " + teachingCourse);
        System.out.println("teachingAge is "+teachingAge);
        String t = abc;
        sum(3,2);



    }

    public  int sum(int a, int b) {

        return a + b;

    }
}
