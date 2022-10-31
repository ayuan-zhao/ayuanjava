package edu.ayuan.basic.interview.javaquestion;

public class PlusPlus {
    public static void main(String[]args){
        int x1 = 7;
        int x2 = 7;
//        x1这个变量增加1，y1表达式的值是增加之前的值，先返回值再增加
        int y1 = x1++;//int y1 = x1; x1++
//        x2这个变量的值增加，y2表达式是增加之后的值，先增加后返回
        int y2 = ++x2; //x2++; int y2 = x2
        System.out.println(x1);//8
        System.out.println(x2);//8
        System.out.println(y1);//7
        System.out.println(y2);//8

        //    ！取反，True ->false, false ->true
//    << >> >>>shift移位操作符
        int x3= 7;
//       111
//       1110 = 14
        System.out.println(x3<< 1);//左移动一位，相当于乘以2
        int x4 =- 7;
        //111
        //
        //对于负数，两个箭头移动，高位补1，两个箭头更像除以2
        //对于负数，三个箭头移动，高位补0，这个会变成正数

//        instanceof
//        bitwise and 按位取与 &,转换成2进制对齐了进行与操作binary calculation

        int x5 = 6;
        //110 = 6
        //011  = 3
        //_____&_____
        //010   = 2
        int y3 = 3;
        System.out.println(x5 & y3);//2

//       ^ bitwise exclusive Or 按位取异或，不同为真，相同为假
//         int x5 = 6;
//        //110 = 6
//        //011  = 3
//        //_____^_____
//        //101   = 5
//        int y3 = 3;
        System.out.println(x5 ^ y3);//return  5

//        bitwise inclusive OR |,假假得假，其它为真
//        logical and &&,logical OR ｜｜
//        temary三位运算符 ?:










    }




}
