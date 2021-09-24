package edu.ayuan.basic.methods;


public class OverloadingMax {
    public static void main(String[] args) {
        OverloadingMax getmax = new OverloadingMax();
        getmax.max(3, 5);
        getmax.max(34, 56);
        getmax.max(33, 44, 55);


    }

    public void max(int x, int y) {
        if (x > y) {
            System.out.println("最大值是" + x);
        } else {
            System.out.println("最大值是" + y);
        }
    }

    public double max(double x, double y) {
        double res = 0;
        if (x > y) {
            res = x;

        } else {
            res = y;

        }
        System.out.println("最大值是" + res);
        return res;
    }


    public void max(double x, double y, double z) {
        double max3 =0;

        max3 = Math.max(Math.max(x, y), z);
        System.out.println("最大值是"+ max3);
    }
    //为什么结果一个是56，一个是55.0，都是double型

}



