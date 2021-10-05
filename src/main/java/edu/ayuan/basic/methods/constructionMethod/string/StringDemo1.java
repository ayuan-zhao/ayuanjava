package edu.ayuan.basic.methods.constructionMethod.string;

/**
 * 通过new创建的字符串对象，每一次new都会申请一个内存空间，虽然内容相同，但是地址值不同。 通过""方式给出的字符串，只要字符序列相同（顺序和大小写），无论在程序代码中出现几次，JVM都只会建立一个String对象，并在字符串池中维护
 */
public class StringDemo1 {

    public static void main(String[] args) {
        //public String();创建一个空白的字符串对象，不含有任何内容
        String s1 = new String();
//这个s1是一个对象，验证方法是，你输入s1.就会出现很多可以调用的方法
        System.out.println("s1:" + s1);
//        public String(char[]chs);根据字符数组的内容，来创建字符串对象
        char[] chs = {'a', 'b', 'c'};
        String s2 = new String(chs);
        System.out.println("s2:" + s2);
//        public String(byte[]bys):根据字节数组的内容，来创建字符串对象
        byte[] bys = {97, 98, 99};//打印出的结果是 abc,因为这些数字对应的字符就是abc
        String s3 = new String(bys);
        System.out.println("s3:" + s3);
//        String s = "abc";直接赋值的方式创建字符串对象，内容就是abc******这种最方便
        String s4 = "abc";
        System.out.println("s4:" + 4);
    }
}
