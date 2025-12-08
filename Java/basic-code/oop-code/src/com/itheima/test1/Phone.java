package com.itheima.test1;

public class Phone {
    //属性
    String brand;
    double price;

    //行为
    //为啥这里没有static？
    public void call() {
        System.out.println("手机在打电话");
    }

    public void playGame() {
        System.out.println("手机在玩游戏");
    }
}
