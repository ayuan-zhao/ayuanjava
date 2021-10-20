package edu.ayuan.basic.methods;

public class Reverse {

    public static void main(String[] args) {

        int[] arr = {19, 23, 45, 67, 85, 56, 69};

        //  reverse(arr);
        reverseSinglesVariation(arr);
        printArray(arr);

//        int start = 0;
//        int end = arr.length - 1;

        /**两个明确
         * 返回值：void
         * 参数，被翻转的数组
         *这个只用一个变量做
         * start是i，循环次数是length/2,end是数组长度-i -1）
         */
    }

    private static void reverseSinglesVariation(int[] arr) {
        int len = arr.length;
        //定义在外面，这样如果reversede的长度有变，比如只循环前五个好改，就可以直接改成int len = arr.length-2;就不需要跑到循环里面改了

        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
    }

    //循环遍历数组，这一次初始化语句定义两个索引变量，判断条件是开始索引小于等于结束索引
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }

        /**方法的两个明确
         * 返回值类型，void
         * 参数 int[]arr
         *
         */
    }

    public static void printArray(int[] arr) {
        //所有要打在一行的，不要再写println，写print就行
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        //写在for循环外面
        System.out.print("]");
    }
////不要每次都用一个格式写for,for里面就可以写条件句
////        for (int x = 0; x < arr.length; x++) {
//            int temp = 0;
////
////            if (start < end) {
////               int temp = arr[end];
////                arr[end] = arr[start];
////                arr[start] = temp;
////            }
//            System.out.print(arr[end]);
//            System.out.print(arr[start]);
//            start++;
//            end--;
//        }
//    }
}
