package edu.ayuan.basic.basicknowledge.inherientance.phone;

public class Phone {

    public void call(String name){
//        name = "父亲的霞霞";不能在这定义name,否则调用的时候传的值就输不进去了
        System.out.println("call"+name);
    }

}
