package edu.ayuan.basic.practice.forDemo;

public class ForDemo4 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 7, 8, 9};
        reverse(arr);
        printArray(arr);

    }
//
//    public static void reverse(int[] arr) {
//        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
//            int temp = arr[min];
//            arr[min] = arr[max];
//            arr[max] = temp;
//        }
//    }



    public static void reverse(int[] arr) {
        for (int min = 0, max = arr.length - 1; min < max ;min++, max--){
//            for循环里可以写两个变量，但是一定要遵守格式
//              1.变量初始化，2.变量的范围，3，变量++或--,这些一定要用分号；隔开，但是两个变量要用,逗号隔开
                int temp = arr[min];//temp是值，不需要用[],但是min,max,循环的是下标，所以要用arr[max]这样写
                arr[min] = arr[max];
                arr[max] = temp;
                System.out.println(arr[min]);
            }
        }
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

}




