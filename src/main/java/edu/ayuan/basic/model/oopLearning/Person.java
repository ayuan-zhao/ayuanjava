package edu.ayuan.basic.model.oopLearning;

import java.sql.SQLOutput;

public class Person {
    //属性，成员变量，类的成员变量可以先声明，不用初始化，类成员变量是有默认值的
    String name; //String 的默认值是null
    int age;//年龄，int的默认值是0

    //行为，方法也叫函数

    /**
     * 这种星星叫文档注释
     * 打印姓名
     */
    public void showName(){//方法的名称如果是多个单词，首个单词的字母小写，其他的单词首字母大写，驼峰命名
        System.out.println("姓名"+name);

    }

    /**
     * 获取年龄
     * @return
     */
    public int getAge() {
        //如果是一个有返回值的方法，那么方法体的最后一行一定是返回相应的数据，
        // 使用return，返回数据类型是与与方法定义的一致

        return age;//方法上定义的int是返回值的类型，return后面跟着的是方法的返回值
    }
}
