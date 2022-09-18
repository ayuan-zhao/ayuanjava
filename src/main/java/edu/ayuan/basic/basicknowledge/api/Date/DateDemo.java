package edu.ayuan.basic.basicknowledge.api.Date;

import java.util.Date;

/*
date可以有子类
Date代表了一个特定的时间，精确到毫秒
public Date()//分配一个Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
public Date(long Date)分配一个Date对象，并将其初始化为表示从标准基准时间气指定的毫秒数
Date
 */
public class DateDemo {

    public static void main(String[] args) {
        Date d1 =new Date();
        System.out.println(d1);//本来应该是全路径名@地址
//  Thu Nov 04 17:55:34 PDT 2021
//        public Date(long Date):分配一个Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date = 1000*60 *60;//要一个long类型的参数，要的是一个毫秒值，秒和毫秒是1000为单位，秒*60*60等于小时
        Date d2 = new Date(date);

    }


}
