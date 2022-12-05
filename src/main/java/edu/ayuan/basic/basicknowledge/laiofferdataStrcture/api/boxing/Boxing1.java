package edu.ayuan.basic.basicknowledge.laiofferdataStrcture.api.boxing;

/*
自动装箱和拆箱
装箱：把基本数据类型转换为对应的包装数据类型
拆箱：把包装类类型转换为对应的基本数据类型

Integer i =100//自动装箱
i+ = 200;//i = i+200;
//i +200 自动拆箱；
//i = i+200,自动装箱

注意，在使用包装类类型的时候，如果做操作，最好先判断是否为null;
我们推荐的是，只要是对象，在使用前就必须进行不为null的判断


 */
public class Boxing1 {

    public static void main(String[] args) {
//        装箱：把基本数据类型转换为对应的包装类型
        Integer i = Integer.valueOf(100);//通过Integer类，调valueOff方法，把它转换为包装类类型
//        i 就是100 对应的包装类类型
        Integer ii = 100;//自动装箱Integer.valueOf(100);

        //拆箱：把包装类型转换为对应的基本数据类型
//        ii = ii.intValue() + 200;//自动装箱。
        // （ii.intValue()__这个动作叫拆箱）
        //ii.intValue()+200-------这个是基本类型
//        ii = ii.intValue() + 200;----------这里的ii是引用类型
        ii += 200;//隐含了自动拆箱和自动装箱
        System.out.println(ii);

        Integer iii = null;
        if (iii != null) {
            iii += 300;//.NullPointerException,iii已经是null了，用null调方法，肯定是空指针
        }
    }
}
