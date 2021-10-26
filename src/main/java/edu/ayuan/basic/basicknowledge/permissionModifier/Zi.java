package edu.ayuan.basic.basicknowledge.permissionModifier;

public class Zi extends Fu {

    public static void main(String[] args) {
//        private 类不能被子类访问
        Zi z =new Zi();
        z.show2();
        z.show3();
        z.show4();
        show5();

        System.out.println("********zi类第2次打印*********");
        Zi z1 =new Zi();
        z1.show2();
        z1.show3();
        z1.show4();
        show5();
    }

}
