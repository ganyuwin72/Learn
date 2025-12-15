package com.itheima.apidemo;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/15
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        Scanner sc = new Scanner(System.in);
        //2.接收一个小数
        System.out.println("请输入一个小数：");
        double result = sc.nextDouble();
        //3.打印结果
        System.out.println(result);
    }
}
