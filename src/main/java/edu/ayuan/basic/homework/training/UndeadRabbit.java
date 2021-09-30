package edu.ayuan.basic.homework.training;

/**
 * 有一对兔子，从出生后第3个月起，没个月都生一对兔子，小兔子长到第三个月每个月又生一对兔子，假如兔子都不死，问第二十个月的兔子的对数有多少？ 菲波那切数列 1，1，2，3，5
 * <p>
 * 第一个月1； 第二个月1； 第三个月2； 第四个月3； 第五个月5； 第六个月8; 从第三个数据开始，每一个数据是前两个数据之和 1.储存多个月的兔子对数，定义一个数组，用动态初始化完成数组的初始化，长度为20；
 * 2.因为第一个月，第二个月兔子的对数是已知的，都是1，所以数组的第一个元素，第二个元素也都是1， 3.用循环实现每个月兔子的对数， 4.输出数组中最后一个元素的值，就是第20个月的兔子的对数
 */

public class UndeadRabbit {

    public static void main(String[] args) {
        int[] arr = new int[20];//如果是不带数据，只定义长度的，就是[],叫做动态初始化Dynamic initialization。如果定义初始值的，就是{}
        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
            /**arr[2]=arr[0]+arr[1];
             * arr[3]=arr[1]+arr[2];
             * arr[4]=arr[2]+arr[3];
             */

        }
        System.out.println("the number of the rabit in the 20th month is " + arr[19]);
    }
}
