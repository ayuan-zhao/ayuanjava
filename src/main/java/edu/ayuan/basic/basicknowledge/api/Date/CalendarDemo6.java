package edu.ayuan.basic.basicknowledge.api.Date;

import java.util.Calendar;

//Calendar rightNow =Calendar.getInstance();
public class CalendarDemo6 {

    public static void main(String[] args) {
//        抽象类，返回的是子类对象的
        Calendar c = Calendar.getInstance();//多态的形式
//        getInstance得到的是calendard的子类对象，整个语句就是多态，父类引用指向子类对象，向上转型，因为抽象类不能直接实例化
//        System.out.println(c);
//        public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

//        public abstract void add(int field, int  amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
        c.add(Calendar.YEAR,-3);
        c.add(Calendar.DATE,+30);
        int year1= c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH);
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + date1 + "日");

    }

}
