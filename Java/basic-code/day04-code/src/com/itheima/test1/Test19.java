package com.itheima.test1;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        /*
            被除数 / 除数 = 商 …… 余数
            给被除数和除数(都是正数，且不会超过Int范围)，不用乘法、除法和%，得到商和余数
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();
        int count = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            count++;
        }
        System.out.println("商为" + count);
        System.out.println("余数为" + dividend);
    }
}
