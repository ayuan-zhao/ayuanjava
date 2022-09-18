package edu.ayuan.basic.basicknowledge.api.integer;

import java.util.Arrays;

public class StringDemo1 {

    public static void main(String[] args) {
//        1.定义一个字符串
        String s = "91 27 46 38 50";
//       2.把字符串中的数字储存到一个String 类型的数组中
        String[] strArray = s.split(" ");//用s.split(" "进行分割)
//        for (int i = 0; i < strArray.length; i++) {
//            System.out.println(strArray[i]);
//        }
//     3. 定义一个int 数组，把String[]数组中的每一个元素储存到int数组中
        int[] arr = new int[strArray.length];//新建数组时[里放的是String数组的长度]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);// arr[i]  =strArray[i]//strArray里每个元素是String类型，arr[i]里是int类型
        }
//        for (int i =0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        arr[i]  =strArray[i]//strArray里每个元素是String类型，arr[i]里是int类型

//    4.对 int 数组就行排序Array.sort(arr)
        Arrays.sort(arr);
//    5.把排序后的int数组中的元素进行拼接，得到一个字符串，这里拼接采用StringBuilder来实现
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println("result:" + result);

    }

}
