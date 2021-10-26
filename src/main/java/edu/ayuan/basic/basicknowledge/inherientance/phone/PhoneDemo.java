package edu.ayuan.basic.basicknowledge.inherientance.phone;

public class PhoneDemo {

    public static void main(String[] args) {
        //
        Phone p = new Phone();
        p.call("林青霞");//这里面传要打电话的人
        System.out.println("-------------------");

        NewPhone np = new NewPhone();
        np.call("霞霞");
        //newphone类里没有call,这个方法，但是newphone 是phone的子类，所以newphone可以调用父类的call方法

    }

}
