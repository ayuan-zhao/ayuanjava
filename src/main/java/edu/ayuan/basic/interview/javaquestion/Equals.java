package edu.ayuan.basic.interview.javaquestion;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * 关于 ==
 * 基本类型：——值比较，比较的是值是否相同
 * 引用类型：比较的是引用是否相同storage address in memory，heap memory address
 *
 * 关于equals，本质上是==，只不过String和integer等重写了equals方法，把它变成了值比较
 * equals 的作用:
 * 　　引用类型：默认情况下，比较的是地址值。
 * 注：不过，我们可以根据情况自己重写该方法。一般重写都是自动生成，比较对象的成员变量值是否相同
 */
public class Equals {


    public static void main(String[] args) {
//
//        String str8 = "abc";
//        String str9 = "abc";
//        System.out.println(str8 == str9);
//        System.out.println(str8.equals(str9));
//        str8 = "bcd";
//        System.out.println(str8); // bcd
//        System.out.println(str9); // abc

        String str18 = new String("123");
        String str19 = new String("123");
        System.out.println(str18 == str19);
        System.out.println(str18.equals(str19));
//        第一个是判断是否严格相等，str的对象，是否等于anobject对象，判断堆内存是否相同
//        public boolean equals(Object anObject) {
//            if (this == anObject) {
//                return true;
//            }
//        第二个是就算不完全相等，是否值是相等的，值相等也equals也返回True
//            if (anObject instanceof String) {
//                String anotherString = (String)anObject;
//                int n = value.length;
//                if (n == anotherString.value.length) {
//                    char v1[] = value;
//                    char v2[] = anotherString.value;
//                    int i = 0;
//                    while (n-- != 0) {
//                        if (v1[i] != v2[i])
//                            return false;
//                        i++;
//                    }
//                    return true;
//                }
//            }
//            return false;
//        }

//
////    堆中有个常量池There is a constant pool in the heap，"hello"在常量池中分配内存String allocates memory in the constant pool
//        String str1 = "Hello";
////    new 的关键词在堆中分配内存，每new一次，都会重新开辟堆内存空间。
//        String str2 = new String("hello");
////    引用传递
//        String str3 = str2;
//        String str4 = "Hello";
////        比的是栈中的值,也就是内存地址
//        System.out.println(str1 == str2);//false
//        System.out.println(str1 == str4); //True,1和4z指向同一个引用
//        System.out.println(str1 == str3);//false，因为str3的引用地址，就是str传过来的引用地址（栈中的值，内存地址）
//        System.out.println(str2 == str3);//true，因为string str3 = str2就是把str2的引用地址，赋给str3（栈中的内存地址）
////        都是True,因为重写之后对比的是每一个字符
//        System.out.println(str1.equals(str2));//True,
//        System.out.println(str1.equals(str3));
//        System.out.println(str2.equals(str3));
    }
}
