package edu.ayuan.basic.methods.constructionMethod.string;

import java.util.Scanner;

public class String2 {

    public static void main(String[] args) {
        //定义两个字符串，表示已知的用户名和密码，用Scanner实现
        String username = "Ayuan";
        String password = "abcd";

        for (int i = 0; i < 3; i++) {

//        键盘录入要登录的用户名和密码，用Scanner实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            System.out.println("请输入密码");
            String pwd = sc.nextLine();

//        用键盘录入的用户名和密码与两个字符串做比较，给出相应的提示
//        字符串比较内容，用equals()方法实现
            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("login successful");
                break;//一旦成功就break
            } else if (2 - i == 0) {
                System.out.println("Your account has been locked, please contact the administrator");
            } else {
                //i的值是0，1，2，3，4  这种反着的数，试试(i.length-i)
                //想要的值是4,3，2，1，0
                System.out.println("Login failed，you still have " + (2 - i) + " chances");
            }
        }
    }
}


