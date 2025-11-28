package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    /*
    需求：
        键盘录入一个大于等于2的整数x，计算并返回x的平方根
        结果只保留整数部分，小数部分将被舍去
     */
    public static void main(String[] args) {
        //1.键盘录入x
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入x");
        int x = sc.nextInt();
        //2.定义变量记录平方根的结果
//        int result = 1;
//        while(result * result <= x){
//            result++;
//        }
//        System.out.println("结果为" + (result - 1));
        for(int i = 1; i <= x; i++){
            if(i * i == x){
                System.out.println(i + "就是" + x + "的平方根");
                break;
            }else if(i * i > x){
                System.out.println((i - 1) + "就是" + x + "的平方根");
                break;
            }
        }
    }
}
