package com.itheima.test1;

import java.util.Scanner;

public class Test1 {
    //机票价格：旺季（5-10月）头等舱9折，经济舱8.5折。淡季（11月到来年4月）头等舱7折，经济舱6.5折。
    public static void main(String[] args) {
        //1.键盘录入机票原价
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价：");
        double price = sc.nextDouble();

        //2.键盘录入当前月份
        System.out.println("请输入当前的月份：");
        int month = sc.nextInt();

        //3.键盘录入是头等舱还是经济舱
        System.out.println("请输入是头等舱（输入1）还是经济舱（输入2）：");
        int seat = sc.nextInt();

        switch (month) {
            case 5,6,7,8,9,10 -> {
                price = getPrice(seat, price, 0.9, 0.85);
            }
            case 11,12,1,2,3,4 -> {
                price = getPrice(seat, price, 0.7, 0.65);
            }
            default -> {
                System.out.println("没有这个月份！");
            }
        }

        //输出实际机票价格
        System.out.println("实际机票价格为：" + price);
    }

    private static double getPrice(int seat, double price, double price1, double price2) {
        if (seat == 1) {
            price *= price1;
        } else if (seat == 2) {
            price *= price2;
        } else {
            System.out.println("没有这个舱位！");
        }
        return price;
    }
}
