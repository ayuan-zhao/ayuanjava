package edu.ayuan.basic.methods;

public class CompareTwoArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 8};

        //别忘了用变量接收！！！
        boolean flag = compare(arr, arr1);
        //接收完别忘了打印！！！
        System.out.println("Are these two arrays equal?" + flag);


    }

    public static boolean compare(int[] arr, int[] arr1) {
        if (arr.length != arr1.length) {
            return false;
        }
        //arr1和arr长度相同才会走到这里
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] != arr1[x]) {
                return false;
            }

        }
        return true;
    }
}

