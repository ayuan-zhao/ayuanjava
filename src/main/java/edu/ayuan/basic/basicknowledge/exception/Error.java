package edu.ayuan.basic.basicknowledge.exception;

public class Error {

    public static void main(String[] args) {

        int[] array = {2, 5, 4, 1};
//    或者
        int[] array2 = new int[4];
        array[0] = 100;
        array[4] = 20;//runtime error,index out of bound
    }

}
