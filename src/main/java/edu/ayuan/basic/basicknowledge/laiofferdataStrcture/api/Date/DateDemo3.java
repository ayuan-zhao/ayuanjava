package edu.ayuan.basic.basicknowledge.laiofferdataStrcture.api.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
构造方法：
public simpleSateFormat():构造一个SimpleDateFormate,使用默认模式和日期格式。
public simpleDateFormat(String pattern): 构造一个SimpleDateFormate 使用"给定的"模式和默认的日期格式
1，格式化（从Date到String）
public final String format(Date date):将日期格式转化成----日期/时间  字符串

2.解析（从String到Date）
public Date parse(String source):从给定字符串的开始 解析文本 以生成日期

 */
public class DateDemo3 {

    public static void main(String[] args) {
//        格式化，从Date 转String，
        Date d = new Date();
//       首先要创建对象，有一个有参构造，一个无参构造。先使用无参构造创建对象
        SimpleDateFormat sdf = new SimpleDateFormat();//在java.text包下
        sdf.format(d);
    }
}
