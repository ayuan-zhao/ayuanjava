package edu.ayuan.basic.homework.training.sales;

public class GeDeBaHeCai {

    public static void main(String[] args) {
        checkGold(1000);

    }

    public static void checkGold(int limit) {
        for (int i = 4; i <= limit; i += 2) {//因为是偶数，所以➕2
            if (canDivide(i)) {
                System.out.println(i + "can be divided into two Prime");
            } else {
                System.out.println("fields award");
                break;

            }
        }

    }

    public static boolean canDivide(int n) {
        for (int i = 2; i <= n / 2; i++) {//此处不能跳
            //都是质数
            if (isPrime(i) && isPrime(n - i)) {
                return true;

            }
        }
//        等试完了之后再返回false
        return false;

    }

    private static boolean isPrime(int n) {//怎么判断是不是质数
//      codition里 求到根号n就可以了。一个整数integer能写成两个整数的乘积product，因子里至少有一个数小于根号n
        for(int i = 2; i * i <= n;i++){
            if(n % i== 0){
                return false;
            }
        }

        return true;
    }
}

