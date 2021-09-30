package edu.ayuan.basic.homework.training;

import java.util.Scanner;
/**
 * 导包
 * 输入星期数，显示今天的减肥活动
 */

import java.util.Scanner;

public class DietPlan {
    public static void main(String[] args) {
//        dietplan1();
        dietplan2();


    }


    public static void dietplan1() {


        Scanner activity = new Scanner(System.in);
        System.out.println("please insert a weekday");
        int week = activity.nextInt();
        if (week < 1 || week > 7) {
            System.out.println("you insert a wrong number ");
        } else if (week == 1) {
            System.out.println("running");
        } else if (week == 2) {
            System.out.println("swimming");
        } else if (week == 3) {
            System.out.println("hiking");
        } else if (week == 4) {
            System.out.println("boxing");
        } else if (week == 5) {
            System.out.println("dancing");
        } else if (week == 6) {
            System.out.println("bicycle");
        } else if (week == 7) {
            System.out.println("climbing");
        }
    }

    private static void dietplan2() {

        Scanner sc = new Scanner(System.in);
        System.out.println("please insert a weekday");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("dancing");
                break;
            case 2:
                System.out.println("running");
                break;
            case 3:
                System.out.println("running");
                break;
            case 4:
                System.out.println("running");
                break;
            case 5:
                System.out.println("running");
                break;
            case 6:
                System.out.println("bicycle");
                break;
            case 7:
                System.out.println("climing");
                break;
            default:
                System.out.println("you insert a wrong number");

        }
    }
}


