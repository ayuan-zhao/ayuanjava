package edu.ayuan.basic.basicknowledge.permissionModifier;

public class Fu {
    private void show1(){
        System.out.println("private");

    }
    void show2(){
        System.out.println("默认");

    }
    protected void show3(){
        System.out.println("protect");

    }

public void show4() {
    System.out.println("public");
}


    static void show5(){
        System.out.println("static");
    }


     static void main(String[] args) {
        Fu f =new Fu();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
        show5();

//        都可以打印出来，说明这四类在本类中都可以访问到。
        Fu f2 =new Fu();
        System.out.println("**********本类第2次打印************");
        f2.show1();
        f2.show2();
        f2.show3();
        f2.show4();
        show5();//可以直接这么写

    }
}
