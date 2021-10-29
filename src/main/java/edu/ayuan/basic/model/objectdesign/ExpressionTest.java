package edu.ayuan.basic.model.objectdesign;

import java.util.Scanner;

public class ExpressionTest {
    public static void main(String[] args) {
//        testExp1();
//        testExp2();
//        testExp3();
//        testScanner4();
//        testSwitchCase();
//        testWhile();
        testFor();
    }

    private static void testFor() {
        int count = 0;
        for (int hour = 0; hour <= 11; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                count++;
                System.out.println(hour + "时" + minute + "分");
            }
        }
        System.out.println(count);
    }

    private static void testWhile() {
        double paper = 0.1;
        int time = 0;
        double maxHeight = 8844430;
        while (paper <= maxHeight) {
            paper *= 2;
            time++;
        }
        System.out.println("折叠的次数是" + time);
    }

    private static void testSwitchCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert a number between 1-7");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Satuarday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }

    private static void testScanner4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert a number between 1-100");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("wrong number");
        } else if (score >= 90) {
            System.out.println("$100");
        } else if (score >= 70) {
            System.out.println("one toy");
        } else {
            System.out.println("one beat");
            //数据测试：正确数据，边界数据，错误数据
        }
    }

    private static void testExp3() {
        //  Scanner sc = new Scanner(System.in);
        //  System.out.println("please insert one day");
        //int week = sc.nextInt();

        //导包，创建对象，接收数据

        Scanner sc = new Scanner(System.in);
        System.out.println("please insert one day 1-5");
        int week = sc.nextInt();

        if (week == 1) {
            System.out.println("星期一");
        } else if (week == 2) {
            System.out.println("星期二");
        } else if (week == 3) {
            System.out.println("星期三");
        } else if (week == 4) {
            System.out.println("星期四");
        } else {
            System.out.println("星期五");
        }
    }

    private static void testExp2() {
        //创建对象
        // Scanner sc = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        //接收数据
        //
        // int a = 10;
        System.out.println("please insert number:");
        //int number = sc.nextInt();
        int shuzi = number.nextInt();

        //int a = a.nextInt();
        if (shuzi % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");

        }
    }

    private static void testExp1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please insert height1:");
        int height1 = sc.nextInt();
        System.out.println("please insert height2:");
        int height2 = sc.nextInt();
        System.out.println("please insert height3:");
        int height3 = sc.nextInt();
//        int height1 = 3, height2 = 5, height3 = 2;

        System.out.println("height 1 is " + height1);
        System.out.println("All hight is:");
        System.out.println(height1 + height2 + height3);

        // (height1 > height2) ? height1 :height2;
        //  (tempHeight > height3)?tempHeight : height3;

        // 1. use 3
//        int highest = (height1 > height2) ? (height1 > height3 ? height1 : height3) : (height2 > height3 ? height2 : height3);
        // 2. use method.
        int highest = getMax(height1, height2, height3);

        System.out.println("highest: " + highest);
    }

    private static int getMax(int height1, int height2, int height3) {
        return Math.max(Math.max(height1, height2), height3);
    }
}
