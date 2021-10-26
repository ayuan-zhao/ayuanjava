package edu.ayuan.basic.basicknowledge.inherientance.phone;

/*
新手机继承自手机
 */
public class NewPhone extends Phone {

//调用的时候要传值的,Override重写，可以写个@Override,可以验算自己是否写错
    @Override
    public void call(String name) {
        System.out.println("video call");
//        System.out.println("call" + name);
//        super.call("彩霞");//不用传值，调用的时候
        super.call(name);//用到父类方法的时候可以用super()方法，不需要写重复的内容
    }


}
