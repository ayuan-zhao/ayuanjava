package edu.ayuan.basic.model.objectdesign;
//设计一个方法用于数组遍历，要求遍历的结果是在一行上的
//数组遍历,主要看格式，第一个【输出要在循环之前
//   System.out.println("输出并换行");输出并换行
//        System.out.print("输出内容不换行");输出内容不换行
//        System.out.println();起到换行的作用
//定义一个数组，用静态初始化完成元素的初始化
//定义一个方法，用数组遍历用用格式对数组进行遍历
//用新的输出语句修改遍历操作
//调用遍历方法

public class ParameterPassing3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }

    /**
     * 两个明确
     * 返回值类型：void
     * 参数：int[]arr
     */
    public static void printArray(int[] arr) {
        System.out.print("[");

        for (int x = 0; x < arr.length; x++) {
//            System.out.println(arr[x]);//会输出竖着的数字
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ",");
            }
        }
        System.out.println("]");
    }
}
