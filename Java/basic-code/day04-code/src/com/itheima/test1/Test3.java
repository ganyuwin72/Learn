package com.itheima.test1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //吃网红餐厅还是沙县小吃

        //1.键盘录入身上的钱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你身上的钱：");
        int money = sc.nextInt();

        //2.进行判断
        if(money > 100){
            System.out.println("吃网红餐厅");
        } else{
            System.out.println("吃沙县小吃");
        }
    }
}
