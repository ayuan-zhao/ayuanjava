package edu.ayuan.basic.methods.constructionMethod.string;

//拼接字符串 int[]arr ={1,2,3},输出结果[1,2,3]
//main static,方法也要是static的
public class StringAdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //调用方法，用一个变量接收方法的结果
        String s = arrayToString(arr);
        //输出结果
        System.out.println("s:"+ s);
    }

    /**
     * 两个明确： 返回值类型：String 参数int[] arr
     */
    public static String arrayToString(int[] arr) {
        //要返回字符串，需要先定义一个字符串
        String s = "";
        //半边括号，放在循环外面
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            //length-1是数组里最后一个元素
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];//分开写逗号和元素，s+，就是积累
                s += ",";
            }
        }
        //括号放在循环外面
        s += "]";
        return s;
    }
}