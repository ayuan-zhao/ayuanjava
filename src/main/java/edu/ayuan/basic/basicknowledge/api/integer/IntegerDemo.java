package edu.ayuan.basic.basicknowledge.api.integer;
/*
int 和String的互相转换
String valueoff()
Integer 是 int 类型包装的值
包装一个对象中的原始类型int值
public static Integer valueOff(int 1) 返回表示指定的int 值的Integer实例

public static Integer valueOff(String s)返回一个保存指定值的Integer对象String
 */
public class IntegerDemo {

    public static void main(String[] args) {
        //int ---to ---String
        int number = 100;
//        方式1：
        String s1 = "" + number;
        System.out.println(s1);
//        方式2：
//        public static String valueOf(int i)
        String s2 =String.valueOf(number);
        System.out.println(s2);
        System.out.println("------------------");


//        String ---to----int
        String s = "100";//必须是数字类型的字符串，不能是Abc这些
//        方式一：
//        String ----Integer------int
        Integer i = Integer.valueOf(s);//String to Integer
//        intValue(),不用传参数，返回Integer的值作为int
        int x = i.intValue();
//        方式二：
        int y = Integer.parseInt(s);//parse是解析的意思
        System.out.println(y);



    }

}
