package edu.ayuan.basic.methods.constructionMethod.string;
/*

 */
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
//        调用方法，用一个变量接收
        String s2 = reverse(line);
//        输出结果：
        System.out.println("s2:"+s2);
    }
    //定义一个方法，实现字符串反转
    /*
    两个明确：
    返回值类型：String
    参数：String
     */


    public static String reverse(String s) {
        String ss ="";
        //倒着遍历，从最后一位 s.length（）-1，到零
        for (int i =s.length()-1;i>0;i--){
            //不停累计下标所对应的char，拼接成一个字符串
            ss += s.charAt(i);

        }

        return ss;


}
}