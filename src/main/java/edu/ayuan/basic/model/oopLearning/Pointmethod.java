package edu.ayuan.basic.model.oopLearning;

public class Pointmethod {
    //一定要先写main方法，再去新建对象，调用程序
    //方法的返回值通常会使用变量来接收，否则该返回值将无意义
    //调用格式，
//  1.  方法名（参数）；
//    2.数据类型 变量名 = 方法名（参数）


    public static void main(String[] args) {


        Point po = new Point(1, 2, 3);
        System.out.println("-- initial --");
        int[] currPoint = po.getPoint();
        for (int i = 0; i < currPoint.length; i++) {
            System.out.println(currPoint[i]);
        }

        // change the x,y,z value of the point
        po.setPoint(6, 7, 8);
        System.out.println("-- after change --");
        int[] postPoint = po.getPoint();
        for (int i = 0; i < postPoint.length; i++) {
            System.out.println(postPoint[i]);
        }
//        po.getPoint(po.x, po.y, po.z);

//        System.out.println(po.getPoint());
//        System.out.println(po.getPoint());

//        int[] arr2 = po.getPoint(1, 2, 3);
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

    }
//    ???咋返回

}



