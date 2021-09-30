package edu.ayuan.basic.model.oopLearning;

public class Point {
    //    构造函数
    //
    public Point(int m, int n, int k) {
        x = m;
        y = n;
        z = k;
    }

    int x;
    int y;
    int z;

    public void setPoint(int m, int n, int k) {
        x = m;
        y = n;
        z = k;
    }

    public int[] getPoint() {
//        get方法，属性方法，getPoint是属于Point的，非static
        int[] coordinate = new int[3];
        coordinate[0] = x;
        coordinate[1] = y;
        coordinate[2] = z;
        return coordinate;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

}
