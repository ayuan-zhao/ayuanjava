package edu.ayuan.basic.basicknowledge.diffPermissionMoifier;

import edu.ayuan.basic.basicknowledge.permissionModifier.Fu;

public class Zi extends Fu {

    public static void main(String[] args) {
        //创建子的对象，看哪些方法可以用

      Zi z =new Zi();
//        z.show1();private不能用
//        z.show2();protect不是一个包，不能用
        z.show3();
        z.show4();
//        z.show5();不是一个包里的void static，不能访问
    }

}
