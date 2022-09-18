package edu.ayuan.basic.basicknowledge.api.Date;

import java.util.Date;

/*
//        获取的是日期对象从1970年1月1日 00：00：00：到  现在 的毫秒值1636075955814
        public long getTime()
            //设置时间，给的是毫秒值
        public void setTime(longtime)
 */
public class DateDemo2 {

    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();
        System.out.println(d);

//        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");//51.8800019316971年
        System.out.println(d);//输出的是现在的时间

        //   long time=100*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);//
        System.out.println(d);


    }

}
