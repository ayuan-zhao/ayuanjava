package edu.ayuan.basic.basicknowledge.permissionModifier;
//permission modifier 权限修饰符
//不同包里，不相关的类只能访问public
//    默认的void,只能访问同一个包里的类
//    protect还可以访问不同包里的子类
public class Demo {

    public static void main(String[] args) {
//        同一个包下，即使没有关系，也可以访问protect,public,pulic static

        Fu f = new Fu();
        f.show2();
        f.show3();
        f.show4();
        f.show5();

        Fu f2 = new Fu();
        System.out.println("*********Fu第2次打印************");
//        f2.show1();
        f2.show2();
        f2.show3();
        f2.show4();
        f.show5();
    }

}
