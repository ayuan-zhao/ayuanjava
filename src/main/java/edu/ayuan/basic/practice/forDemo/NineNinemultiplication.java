package edu.ayuan.basic.practice.forDemo;

public class NineNinemultiplication {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {//想清楚，乘法口决是从1开始，<=9,脑袋要清楚
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i+" ");//如果不想换行的时候记得用print,不用println
            }
            System.out.println();//如果是双层循环，一层循环结束以后可以换行一下
        }
    }
}

