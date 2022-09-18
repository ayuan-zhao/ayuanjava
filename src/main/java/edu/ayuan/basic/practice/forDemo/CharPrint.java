package edu.ayuan.basic.practice.forDemo;

public class CharPrint {

    public static void main(String[] args) {
        char uppercase = 'A';
        char lowercase = 'a';
        for (int i = 0; i < 26; i++) {//i虽然没有输出，但是可以控制输出次数，
            System.out.println("大写字母是： " + uppercase + "小写字母是：" + lowercase);

            uppercase++;//不能把uppercase，lowercase直接写在循环里，需要有一个来限制次数的阀门
            lowercase++;

        }
    }
}