package edu.ayuan.basic.basicknowledge.api.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
y 年
M 月
d 日
H 时
m 分
s 秒
 */
//MM-dd-yy  月/日/年
//HH-mm-ss  时/分/秒
//直接新建SimpleDateFormat类的对象，用有参构造方法定义格式，
//再然后就是获取当前时间，Date d = new Date();
//再用SimpleDateFormate 新建的对象s 调用它format方法，传日期对象d 返回的是String类型
//这时候再输出，就会按照我们刚才定义的格式，年月日，时分秒的输出了
//publicSimpleDateFormat()构造一个SimpleDateFormat,使用默认模式和日期格式
//publicSimpleDateFormat(String pattern)构造一个SimpleDateFormat使用给定的模式和默认的日期格式
public class SimpleDateFormatDemo4 {

    public static void main(String[] args) throws ParseException {

        //格式化：从Date到String
        Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat();//无参构造，创建方法
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        String s = sdf.format(d);//sdf 调用SimpleDateFormat方法，传日期对象d,返回一个String类型

        System.out.println(s);

//        从String 到 Date

        String ss = "2048-08-09 11:11:30";
//        SimpleDateFormat传的值，要和String ss传的值的格式完全匹配"yyyy年MM月dd日 HH:mm:ss这样是不行的，需要写为yyyy-MM-d HH:mm:ss"
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-d HH:mm:ss");
        Date d2 = sdf2.parse(ss);
        System.out.println(d2);


    }

}
