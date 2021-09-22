package edu.ayuan.basic;

public class ArrayTest {
    public static void main(String[] args) {
        testMax();
        testMin();
    }

    private static void testMin() {
        int[] arr = {100, 2, 33, 44, 55, 66};
//        for (int x = 0; x <arr.length;x++){
////            System.out.println(arr[x]);
//        }
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (min > arr[x]) {
                min = arr[x];
            }
        }
        System.out.println(min);
    }

    private static void testMax() {
        int[] arr = {1, 2, 33, 44, 55, 66};
//        for (int x = 0; x <arr.length;x++){
////            System.out.println(arr[x]);
//        }
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (max < arr[x]) {
                max = arr[x];
            }
        }
        System.out.println(max);
    }
}
