package edu.ayuan.basic.basicknowledge.api.bubbleSort;

import static edu.ayuan.basic.methods.constructionMethod.string.StringAdd.arrayToString;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] arr = {23, 44, 55, 67, 77, 88, 35};
        System.out.println("排序前：" + arrayToString(arr));

//        //第一次比较
//
//        for (int i = 0; i < arr.length-1-0; i++){
//            if(arr[i]>arr[i+1]){
//                int temp =arr[i];
//                arr[i] =arr[i+1];
//                arr[i+1]=temp;
//            }
//            System.out.println("第一次：" + arrayToString(arr));
//        }
//        //把数组中的元素按照指定的规则组成一个字符串：[元素1，元素2，。。。]
//
////        第二次
//        for (int i = 0; i < arr.length-1-1; i++){
//            if(arr[i]>arr[i+1]){
//                int temp =arr[i];
//                arr[i] =arr[i+1];
//                arr[i+1]=temp;
//            }
//            System.out.println("第一次：" + arrayToString(arr));
//        }
//        for (int i = 0; i < arr.length-1-2; i++){
//            if(arr[i]>arr[i+1]){
//                int temp =arr[i];
//                arr[i] =arr[i+1];
//                arr[i+1]=temp;
//            }
//            System.out.println("第一次：" + arrayToString(arr));
//        }

//        外循环控制比较次数，内循环控制每次参与比较的元素
        for(int x = 0; x<arr.length-1; x++){
            for(int i =0; i <arr.length-1-x;i++){
                if(arr[i]>arr[i+1]);
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1] =temp;
            }
        }
        System.out.println("排序后：" + arrayToString(arr));
    }
}
