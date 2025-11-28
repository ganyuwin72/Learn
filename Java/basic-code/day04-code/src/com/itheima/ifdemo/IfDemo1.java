package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //1.键盘录入女婿的酒量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的酒量：");
        int wine = sc.nextInt();

        //2.判断酒量是否大于2，大于则输出回应
        if(wine > 2){
            System.out.println("小伙子，不错呦！！！");
        }
    }
}
