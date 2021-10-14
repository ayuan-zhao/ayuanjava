package edu.ayuan.basic.homework.studentManagemerntSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static <Arraylist> void main(String[] args) {
//        switch要用到一个集合，要用很多次，所以一进来就要定义这个集合
//         创建集合对象，用来存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();

        while (true) {
            System.out.println("----------welcome to Student management System-----------");
            System.out.println("1.add student");
            System.out.println("2.delete student");
            System.out.println("3.update student");
            System.out.println("4.findAllstudent");
            System.out.println("5.quit");
            System.out.println("please insert your choice");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    addStudent(array);
                    System.out.println("add student");
                    break;
                case "2":
//                    System.out.println("delete student");
                    deleteStudent(array);

                    break;
                case "3":
//                    System.out.println("update student");
                    updateStudent(array);
                    break;
                case "4":
                    // System.out.println("findAllstudent");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("Thank you for check");
//                    break;
                    System.exit(0);//jvm退出

            }
        }
    }

    //    定义一个方法，用于添加学生信息
//    public static void addStudent(ArrayList<Student> array) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("please insert the student ID");
//        String sid = sc.nextLine();
//        System.out.println("please insert the student's name");
//        String name = sc.nextLine();
//        System.out.println("please insert the student's age");
//        String age = sc.nextLine();
//        System.out.println("please insert the student address");
//        String address = sc.nextLine();
//
////创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
//        Student s = new Student();
//        s.setSid(sid);
//        s.setName(name);
//        s.setAge(age);
//        s.setAddress(address);
//
////        将学生对象添加到集合中
//        array.add(s);
//        System.out.println("add student successfully");
//
//        //        添加学生信息
////        public static void addStudent (ArrayList < Student > array) {
//        System.out.println("1.add student");
//
//    }
    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
//        为了让sid在while循环外面被访问的到，我们就把它定义在了循环外
        String sid;
//为了让程序能够回到这里，我们使用循环实现
        while(true) {
            System.out.println("please insert the student ID");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {//如果是true，就回到前面输入
                System.out.println("The student ID has already been used, please enter a new one");
            }else{//如果是false，就跳出这个循环
                break;
            }
        }


        System.out.println("please insert the student's name");
        String name = sc.nextLine();
        System.out.println("please insert the student's age");
        String age = sc.nextLine();
        System.out.println("please insert the student address");
        String address = sc.nextLine();

//创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

//        将学生对象添加到集合中
        array.add(s);
        System.out.println("add student successfully");

        //        添加学生信息
//        public static void addStudent (ArrayList < Student > array) {
        System.out.println("1.add student");

    }


    //        查看学生信息
    public static void findAllStudent(ArrayList<Student> array) {
//        先做一个判断，集合中是否有数据，如果没有，显示提示信息
        if (array.size() == 0) {
            System.out.println("there is no information,please add one, then, you can try again");
            //为了让程序不在往下执行，给出return;
            return;
        }
//        System.out.println("2.find Student");
//        显示表头信息
//        \t 其实是tab键的位置
        System.out.println("ID\t\t\tname\t\tage\t\taddress");
//        将集合中的数据取出按照对应格式显示学生信息，年龄显示补充岁
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out
                .println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "\t\t" + s.getAddress());
        }
    }

    //        删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        // System.out.println("2.delete student");
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert the sid that you want to delete:");
        String sid = sc.nextLine();
        //遍历集合，将对应的学生对象从集合中删除
        int index = -1;//index是不可能等于-1的，所以如果循环外判断index是负一，说明没有找到这个值
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("this sid is not found,please insert again");
        } else {

        }
        array.remove(index);
        System.out.println("delete successfully");
    }

    //        修改学生信息
    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert the sid that you want to update");
        String sid = sc.nextLine();
        System.out.println("please insert the new information of the student");
//键盘录入要修改的学生信息
//注意啊，sid是坐标，这个就不要改了，否则就找不到了，改其他的内容，方法内变量的名字都不需要改
        System.out.println("please insert the student's new name");
        String name = sc.nextLine();
        System.out.println("please insert the student's new age");
        String age = sc.nextLine();
        System.out.println("please insert the student new address");
        String address = sc.nextLine();
//        创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

//遍历集合修改对应学生的信息
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (s.getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }
        System.out.println("change successfully");
    }
//判断学号是否被占用，如果集合中的某一个学生学号相同，返回true，如果都不相同，返回false
    public static boolean isUsed(ArrayList<Student> array, String sid) {
        boolean flag = false;

        for(int i =0;i<array.size();i++){
            Student s = array.get(i);
            if(s.getSid().equals(sid)){
                //如果已经有相同的了，就返回true
                flag =true;
                break;
            }
        }
//        否则返回 false
        return flag;

    }
}






