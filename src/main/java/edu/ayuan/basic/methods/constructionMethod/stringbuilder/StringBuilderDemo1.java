package edu.ayuan.basic.methods.constructionMethod.stringbuilder;

public class StringBuilderDemo1 {
    /*
Stringbuilder构造对象
public StringBuilder()创建一个空白可变的字符串，不含有任何内容
public StringBuilder(String str)根据字符串的内容，来创建可变字符串对象
 */

    public static void main(String[] args) {
        //创建一个空白可变字符串，不含任何内容
        //这个非要用这个类名，就需要带包名,StringBuilder和String一样是系统建好的类，如果自己写的重名，系统就以为这个是自己建的类
        // java.lang.StringBuilder sb = new java.lang.StringBuilder();
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());

//

//        public StringBuilder(String str)根据字符串的内容，来创建可变字符串对象
        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println("sb2" + sb2);
        System.out.println("sb.length():" + sb2.length());
    }
}

