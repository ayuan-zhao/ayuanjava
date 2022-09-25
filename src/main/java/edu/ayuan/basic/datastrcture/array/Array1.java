package edu.ayuan.basic.datastrcture.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
//          <>括号里是泛型，规定类型的，arrayList里什么都能加，规定了一种就只能加一种,
//        不需要规定长度
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            arr.add(i + 1);
        }
        System.out.println("arr: " + arr.toString());
//          这种圆括号调的是ArrayList的构造函数
        ArrayList list = new ArrayList();
//            object,又可以传多种元素，又是泛型
        ArrayList<object> list2 = new ArrayList<>();

//添加元素：add element: O(1),ArrayList 不指定，默认插在最尾端，复杂度O（1），
        arr.add(99);
        System.out.println("arr:" + arr.toString());
//可以指定index插入，但是复杂度为 O（N），（索引，值）
        arr.add(3, 88);
        System.out.println("arr_new" + arr.toString());

//        access element, O(1),直接通过下标，索引取值，去地址取值
//        array方法
        int c1 = c[1];
//        arrayList 方法
        int arr1 = arr.get(1);
        System.out.println("c1:" + c1);
        System.out.println("arr1:" + arr1);
        System.out.println("arr" + arr);

//        更新元素update,O(1)
//        array
        c[1] = 11;
//        arrayLIst
        arr.set(1, 11);
        System.out.println("c1: " + c[1]);
        System.out.println("arrser1to11" + arr);
        System.out.println("arrget1: " + arr.get(1));

//        删除 delete,如果程序中有删除这种操作，就用Arraylist
        arr.remove(3);
        System.out.println("arr1:delete3: " + arr.get(1));
        System.out.println("newarr: " + arr);

//array，数组长度方法
        int cSize = c.length;
//        arrayList size方法
        int arrSize = arr.size();
        System.out.println("c Length: " + cSize);
        System.out.println("arrLength: " + arrSize);
//遍历数组

        for (int i = 0; i < c.length; i++) {
            int current = c[i];
            System.out.println("iterate: " + "i+" + current);
        }
        for (int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            System.out.println("iterate: " + "i+" + current);
        }

//        查找元素 find an element，O(N)
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 100) {
                System.out.println("c is here:" + i);
            } else {
                System.out.println("sorry there is no " + c[i] + " at  " + i);

            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 88) {
                System.out.println(arr.get(i) + " is here: " + i);
            } else {
                System.out.println("sorry, there is no " + arr.get(i) + " in " + i);

            }
//            find an element in arr写好的方法 O(N)
            boolean is99 = arr.contains(99);
            System.out.println("Are we found 99 in arr" + is99);


        }
//sort an array by built in lib
        c = new int []{2,3,1};
        arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println("c:"+ Arrays.toString(c));
        System.out.println("arr: " + arr.toString());
        Arrays.sort(c);
        System.out.println("c:"+ Arrays.toString(c));
        System.out.println("arr: " + arr);

//        o(nlog)n
        System.out.println("arr: "+ arr);
        System.out.println();
//        如果要从大大小进行排序
//        Arrays.sort(T[],Collections.reversOrder());
//        for arr
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println("arr: "+ arr);






    }
}


