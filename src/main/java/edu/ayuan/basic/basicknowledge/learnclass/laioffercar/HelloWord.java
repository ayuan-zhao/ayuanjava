package edu.ayuan.basic.basicknowledge.learnclass.laioffercar;

public class HelloWord {
    public static void main(String[]args){
//       initialization /instantiation
//        firstStudent,sestu,thrstu,都是reference,一个名片
        Student firstStudent = new Student("Tom");
        Student secondStudent = new Student("jerry");
        firstStudent = secondStudent;

        Student thirdStudent = null;
        firstStudent.setAge(18);
        secondStudent.setAge(10);
        firstStudent.sayHello();
        secondStudent.sayHello();




    }

}
