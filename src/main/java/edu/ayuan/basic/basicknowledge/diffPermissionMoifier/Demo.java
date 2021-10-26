package edu.ayuan.basic.basicknowledge.diffPermissionMoifier;

import edu.ayuan.basic.basicknowledge.permissionModifier.Fu;

public class Demo {

/*/permission modifier 权限修饰符
//不同包里，不相关的类只能访问public
//    默认的void,只能访问同一个包里的类
//    protect还可以访问不同包里的子类

 */
    public static void main(String[] args) {
        Fu f = new Fu();
//        f.show1();private类不能被调用
//        f.show2();protect类不能被调用
//        f.show3();默认void的类不能被调用
        f.show4();
//        f.show5();不是一个包里的void static不能被调用

        Fu f2 = new Fu();
        System.out.println("*********Fu第2次打印************");
//        f2.show1();
//        f2.show2();
//        f2.show3();
        f2.show4();
//        f.show5();
    }

}
