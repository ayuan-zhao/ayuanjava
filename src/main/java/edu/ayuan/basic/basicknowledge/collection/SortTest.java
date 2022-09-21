package edu.ayuan.basic.basicknowledge.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://www.geeksforgeeks.org/collections-sort-java-examples/
public class SortTest {

}

class Student {

    int rollno;
    String name, address;

    // Constructor
    public Student(int rollno, String name,
        String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name +
            " " + this.address;
    }
}

class Point {

    public Point(int t, int s) {
        this.T = t;
        this.S = s;
    }

    int T;
    int S;


    // Used to print student details in main()
    public String toString() {
        return "[" + this.T + "," + this.S + "]";
    }
}

class Sortbyroll implements Comparator<Student> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class Sort implements Comparator<Point> {

    // Used for sorting in ascending order of
    // roll number
    public int compare(Point a, Point b) {
        if (a.T == b.T) {
            return a.S - b.S;
        }
        return a.T - b.T;
    }
}

// Driver class
class Main {

    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1, 1));
        list.add(new Point(10, 0));
        list.add(new Point(2, 1));
        list.add(new Point(3, 0));

//        Collections.sort(list, new Sort());
        Collections.sort(list, (p1, p2) -> {
            if (p1.T == p2.T) {
                return p1.S - p2.S;
            }
            return p1.T - p2.T;
        });

//        System.out.println(list);
        for (Point p : list) {
            System.out.println(p);
        }
    }

//    public static void main(String[] args) {
//        ArrayList<Student> ar = new ArrayList<Student>();
//        ar.add(new Student(111, "bbbb", "london"));
//        ar.add(new Student(131, "aaaa", "nyc"));
//        ar.add(new Student(121, "cccc", "jaipur"));
//
//        System.out.println("Unsorted");
//        for (int i = 0; i < ar.size(); i++) {
//            System.out.println(ar.get(i));
//        }
//
//        Collections.sort(ar, new Sortbyroll());
//
//        System.out.println("\nSorted by rollno");
//        for (int i = 0; i < ar.size(); i++) {
//            System.out.println(ar.get(i));
//        }
//    }
}
