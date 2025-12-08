package com.itheima.test1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //if的嵌套
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的票号：");
        int ticket = sc.nextInt();
        if(ticket >= 0 && ticket <= 100){
            if(ticket % 2 == 1){
                System.out.println("坐左边");
            } else {
                System.out.println("坐右边");
            }
        }
    }
}
