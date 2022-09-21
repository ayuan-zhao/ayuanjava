package edu.ayuan.basic.methods;

public class OverloadingEnglish{
//    overloaded sum(),this sum takes two int parameters
    public int sum (int x, int y){
        return (x + y);
    }
//    overloaded sum().this sum takes three int parameters
    public int sum(int x, int y, int z){
        return (x + y + z);
    }
//    float需要在小树后加 f
//    overloaded sum(). this sum takes three float parameters
    public float sum(float x, float y,float z){
        return ( x + y + z);
    }
//    driver code
    public static void main(String args[]){
        OverloadingEnglish o = new OverloadingEnglish();
        System.out.println(o.sum(2,3));
        System.out.println(o.sum(4,5,6));
        System.out.println(o.sum(4.5f,5.5f, 6.5f));

    }
}