package edu.ayuan.basic.inherientance.teacherstudent;

public class TeacherStudentDemo {

    public static void main(String[] args) {
//
        Teacher t1 = new Teacher();
        t1.setName("孔子");
        t1.setAge(800);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 =new Teacher("老子",900);
//        t2.setName("老子");
//        t2.setAge(900);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();
    }

}
