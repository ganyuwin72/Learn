package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest7 {
    public static void main(String[] args) {
        /*
        注意点：
            生成随机数的代码不能在循环的外边，否则每次都会生成一个新的随机数
         */

        /*
        扩展：
            抽奖保底机制
         */

        //1.生成一个1-100之间的随机数
        Random r =  new Random();
        int number = r.nextInt(100) + 1;

        //2.计数器统计猜了多少次
        int count = 0;

        //3.while循环猜这个数字是多少
        Scanner sc = new Scanner(System.in);
        while(count < 10){
            System.out.println("请输入你要猜的数字：");
            int guestNumber =  sc.nextInt();
            if(guestNumber > number){
                System.out.println("大了");
            }else if(guestNumber < number){
                System.out.println("小了");
            }else{
                System.out.println("猜中了");
                break;
            }
            count++;
        }
        System.out.println("告诉你吧，number是" + number);
    }
}
