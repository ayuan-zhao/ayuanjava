package edu.ayuan.basic.methods.constructionMethod.stringbuilder;

public class StringBuilderDemo4 {

    //拼接字符串
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        传实参不需要写类型！！
        String ping =arrToString(arr);

        System.out.println("ping: "+ ping);
    }

    /*
    两个明确：
    返回值类型：String
    参数：int[]arr
     */
    public static String arrToString(int[] arr) {
        //这方法中用StringBuilder 按照要求进行拼接，并把结果转成String返回
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                //可以直接拼接，不用另起一行
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        //通过toString方法转化为String类型
        String ping = sb.toString();
        return ping;
    }

}