package com.itheima.test;

import java.util.Scanner;

public class LoopTest4 {
    //判断是否为质数的简化思路
    public static void main(String[] args) {
        //1.键盘录入一个正整数
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        //2.定义一个变量，标记number是否为一个质数。
        boolean flag = true;
        //3.判断
        for(int i = 2; i * i <= number; i++){
            if(number % i == 0){
                flag = false;
                //System.out.println("该正整数为合数");
                break;
            }
        }
        if(flag){
            System.out.println(number + "是质数");
        }else{
            System.out.println(number + "不是质数");
        }
    }
}
