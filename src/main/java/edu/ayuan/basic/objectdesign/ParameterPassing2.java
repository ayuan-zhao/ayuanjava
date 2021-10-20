package edu.ayuan.basic.objectdesign;

//方法参数传递——引用类型
//对于引用类型的参数，形式参数的改变，影响实际参数的值
//实际是地址传递，形参和实参都是指针，将实参的值附给形参后，两个指针指向同一块堆数据
public class ParameterPassing2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("before pasing" + arr[1]);
        change(arr);
        System.out.println("after pasing" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
