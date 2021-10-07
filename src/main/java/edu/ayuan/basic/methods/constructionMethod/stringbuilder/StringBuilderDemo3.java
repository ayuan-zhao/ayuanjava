package edu.ayuan.basic.methods.constructionMethod.stringbuilder;

/*
 public String toString():通过同String()就可以实现StringBuild转换为String
 public StringBuilder(String s):通过构造方法就可以实现把String转换为StringBuilder

    }
 */
public class StringBuilderDemo3 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
//        String s = sb;这个是错误的做法
//        public String toString():通过同String()就可以实现StringBuild转换为String
        String s = sb.toString();
        System.out.println(s);


//      String 转换为StringBuilder
//      StringBuilder sb = s；这个是错误的做法
        sb = new StringBuilder(s);
        System.out.println(sb);
//
    }
}

