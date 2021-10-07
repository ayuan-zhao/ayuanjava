package edu.ayuan.basic.methods.constructionMethod.stringbuilder;

/*
public String append(任意类型)，添加数据，返回对象本身
public StringBuilder reverse(),返回相反的字符序列
 */
public class StringBuilderDemo2 {

    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();
//publicString append(任意类型)，添加数据，返回对象本身!!,sb.append,添加后hello，sb本身就变成了hello
        StringBuilder sb2 = sb.append("hello");

        System.out.println("sb:" + sb);
        System.out.println("sb2:" + sb2);
        // (s1.equals(s2));比较字符串内容是否相同
        System.out.println(sb.equals(sb2));
        //     比较字符串对象地址是否相同(sb==sb);
        System.out.println(sb == sb2);
//        sb.append("hello");
//        sb.append("world");
//        sb.append(100);
//        或者链式编程：( sb.append("hello").append("world")).append（100）括号里的整体是一个对象
        sb.append("hello").append("world").append(100);
        System.out.println("sb:" + sb);
        sb.reverse();
        System.out.println("sb:" + sb);
    }
}
