package edu.ayuan.basic.basicknowledge.api.Date.Date5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//    1.定义日期工具类（DateUtils）
//   2. 定义一个方法dateToString 用于把日期转换为指定格式的字符串
//           返回值类型：String
//          参数 Date date，String format
//   3. 定义一个方法StringToDate,用于字符串解析为指定格式的日期
//           返回值类型Date
//           参数 String s String format
//    4.定义测试类DateDemo,调用日期工具类中的方法
//        **********工具类*******
//一般构造方法私有(外界无法创建对象)，成员方法静态
public class DateUtils {

    private DateUtils() {
    }//无法创建对象

    public static String dateToString(Date date, String format) {//外界使用的是dataToString,用类名访问（因为是static）
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;

    }

    //    定义一个方法StringToDate,用于字符串解析为指定格式的日期
//           返回值类型Date
//           参数 String s String format
    public static Date StringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat(format);
        Date d = sdf2.parse(s);
        return d;

    }

}
