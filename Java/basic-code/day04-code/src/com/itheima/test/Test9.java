package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    //一周的运动
    public static void main(String[] args) {
        //1.键盘录入星期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天星期几：");
        int week =  sc.nextInt();
        //2.判断今天的运动
        switch(week){
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("慢走");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("羽毛球");
                break;
            case 5:
                System.out.println("篮球");
                break;
            case 6:
                System.out.println("足球");
                break;
            case 7:
                System.out.println("乒乓球");
                break;
            default:
                System.out.println("没有这个星期");
                break;
        }
    }
}
