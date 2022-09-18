package edu.ayuan.basic.practice.forDemo;

public class ArrayTest {

        public static void main(String[] args){
            int[] arr1 = {4,6,7,1};
            int[] arr2 = {1,2,3,9,10};
            printArray(arr1);
            printArray(arr2);
        }
        public static void printArray(int[] arr){//这个形式参数，是方法体里一会要用的

            System.out.print("[");
            for(int i = 0 ; i <arr.length ; i++){
                if( i == arr.length-1){
                    System.out.println(arr[i]+"]");
                }else{
                    System.out.print(arr[i]+",");
                }
            }
        }
    }


