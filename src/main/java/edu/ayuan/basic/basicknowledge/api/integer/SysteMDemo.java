package edu.ayuan.basic.basicknowledge.api.integer;

public class SysteMDemo {

    public static void main(String[] args) {
//        System.out.println("开始");
////        public static void exit(int status):终止当前运行额Java虚拟机，非零表示异常终止
////        所以0表示正常终止
//        System.exit(0);//java虚拟机终止了，程序也终止了
//        System.out.println("结束");
//    }
//public static long currentTimeMillis；返回当前时间（以毫秒为单位）
        System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365 + "年");
       long start =System .currentTimeMillis();
        for(int i =0;i<10000;i++){
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end -start)+"毫秒");
    }
}
