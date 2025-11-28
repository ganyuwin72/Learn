package com.itheima.switchdemo;

/*
    switch新特性
        JDK12
 */

import java.util.Scanner;

public class SwitchDemo4 {
    public static void main(String[] args) {
        //需求
        // 1 2 3 一 二 三
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int number = sc.nextInt();
        //用大括号简化switch语句
//        switch (number){
//            case 1 -> {
//                System.out.println("一");
//            }
//            case 2 -> {
//                System.out.println("二");
//            }
//            case 3 -> {
//                System.out.println("三");
//            }
//            default -> {
//                System.out.println("没有这种选项");
//            }
//        }
        //大括号只有一个语句，可以省略掉
        switch (number){
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
        //switch的结果还可以用一个变量接收
    }
}
