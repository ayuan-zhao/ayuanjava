package edu.ayuan.basic.practice.forDemo;

public class ForDemo {

        public static void main(String[] args){
            int[] arr = {1,2,3,4,7,8,9};
            reverse(arr);
            printArray(arr);
        }
        public static void reverse(int[] arr){
            for(int min=0,max = arr.length-1; min<max ; min++,max--){
                int temp = arr[min];
                arr[min] = arr[max];
                arr[max] = temp;
            }
        }
        public static void printArray(int[] arr){
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


