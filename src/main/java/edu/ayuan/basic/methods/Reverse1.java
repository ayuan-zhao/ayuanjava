package edu.ayuan.basic.methods;

public class Reverse1 {

    public static void main(String[] args) {

        reverse1();
        reverse2();
    }

    private static void reverse2() {
        int arr[] = {19, 23, 45, 67, 85, 56, 69};

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    private static void reverse1() {
        int arr[] = {19, 23, 45, 67, 85, 56, 69};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }


}
