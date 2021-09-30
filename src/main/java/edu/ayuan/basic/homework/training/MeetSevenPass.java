package edu.ayuan.basic.homework.training;

import java.util.Scanner;

/**
 * 逢七过
 * 要报的数字包含七或者是7的倍数时输出"过
 * x%10==7,个位是7;
 * x/10%10==7，十位是7;
 * x%10==0，被7整除；
 */
public class MeetSevenPass {
    public static void main(String[] args) {

//        meetSevenPass();
//        scannerMeetSevenPass();
officalMeetSevenPass();

    }



    private static void meetSevenPass() {
        for (int x = 1; x < 100; x++) {
            if (x % 10 == 7) {
                System.out.println(x + "'s  single digit is 7");
            } else if (x / 10 % 10 == 7) {
                System.out.println(x + "'s  tens digit is 7 ");
            } else if (x % 7 == 0) {
                System.out.println(x + " is divisible by 7");
            }else {
                System.out.println("normal number");
            }
            //777
            //777's  single digit is 7，怎么显示个位是7，十位是7，百位是7，用或者
        }

    }

    public static void scannerMeetSevenPass() {
        System.out.println("please insert a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 10 == 7) {
            System.out.println(number + "'s  single digit is 7");
        } else if (number / 10 % 10 == 7) {
            System.out.println(number + "'s  tens digit is 7 ");
        } else if (number % 7 == 0) {
            System.out.println(number + " is divisible by 7");
        }
    }
    private static void officalMeetSevenPass() {
        for(int x =1; x<100;x++){
            if (x%10==7||x/10%10==7||x%7==0){
                System.out.println(x+ "pass");
            }
        }
    }
}

