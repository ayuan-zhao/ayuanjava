package edu.ayuan.basic.model.objectdesign;

import java.util.Random;
import java.util.Scanner;

public class Puzzles {
    public static void main(String[] args) {
//        testFlower();
        guessNumber();
    }

    private static void guessNumber() {
        Random r = new Random();
        int number = r.nextInt(101);

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("please insert a number you want to guess");

            int guessedNumber = sc.nextInt();

            if (guessedNumber > number) {
                System.out.println("too big");
            } else if (guessedNumber < number) {
                System.out.println("too small");
            } else {
                System.out.println("correct!");
                break;
            }
        }
    }

    private static void testFlower() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (Math.pow(ge, 3) + shi * shi * shi + bai * bai * bai == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
