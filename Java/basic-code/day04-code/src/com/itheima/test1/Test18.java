package com.itheima.test1;

import java.util.Scanner;

public class Test18 {
    //回文数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number =  sc.nextInt();
        int temp = number;
        int reverse = 0;
        while(temp != 0){
            int ge = temp % 10;
            temp /= 10;
            reverse = reverse * 10 + ge;
        }
        System.out.println(reverse == number);
    }
}
