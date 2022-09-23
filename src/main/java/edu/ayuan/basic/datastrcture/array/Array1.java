package edu.ayuan.basic.datastrcture.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

    public static <object> void main(String[] args) {
//        写在花括号里的是具体的内容，写在方括号里的是数组大小
        //1.如果明确知道数组的内容，可以直接创建数组,a代表1，2，3
        int[] a = {1, 2, 3};
        System.out.println("a: " + Arrays.toString(a));
//        2.也需要提前得知数组元素
        int[] b = new int[]{1, 2, 3};
        System.out.println("b: " + Arrays.toString(b));
//        3. 直接定数组大小，而不是数组内容，其中3为占位符,打印的时候会显示3个0
        int[] c = new int[3];
//        直接打印c会显示[0,0,0]
        for (int i = 0; i < c.length; i++) {
//            这是给c里的每个元素赋值
            c[i] = i + 1;

        }
            System.out.println("c: " + Arrays.toString(c));
//      4.arrayList，不能放int,要放integer,因为要放一个对象。integer 是int的对象类型
//          <>括号里是泛型，规定类型的，arrayList里什么都能加，规定了一种就只能加一种
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0; i < 3; i++){
                arr.add(i + 1);
            }
        System.out.println("arr: " + arr.toString());
//          这种圆括号调的是ArrayList的构造函数
            ArrayList list = new ArrayList();
//            object,又可以传多种元素，又是泛型
        ArrayList<object> list2 = new ArrayList<>();

//

    }

}
