package edu.ayuan.basic.methods.constructionMethod.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo5 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("please insert a String");
        String s =  sc.nextLine();
        String s1 =StringReverse(s);
        System.out.println("s1"+s1);


    }

    //    定义一个方法实现字符串反转,返回值类型String,参数String
    public static String StringReverse(String s) {
//        StringBuilder sb =new StringBuilder(s);
//        sb.reverse();
//        String s1 = sb.toString();
//        return s1;


//        放在一行里执行
        return new StringBuilder(s).reverse().toString();

//        傻不傻，只要数组才能这样做哦，StringBuild不需要
//        sb.append("[");
//        for(int i = s.length()-1;i >=0;i--){
//            if(i==0) {
//                sb.append();
//            }else{
//                sb.append().append(", ");
//            }
//        }
//        sb.append("]");
    }

}
