package edu.ayuan.basic.basicknowledge.api.Date.Date5;

import java.text.ParseException;
import java.util.Date;

public class DateDemo5 {

    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();
        String s1=  DateUtils.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");//传一个Date的对象，传一个String 的format
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d,"HH.mm.ss");//格式不能该，只能多或少
        System.out.println(s2);

        System.out.println("***********");

        String st = "11.11.2021 12:12:12";
        Date dd=DateUtils.StringToDate(st,"MM.dd.yyyy HH:mm:ss");//format是格式
        System.out.println(dd);
    }


}
