package com.itheima.switchdemo;

import java.util.Scanner;

public class SwitchDemo3 {
    public static void main(String[] args){
        /*
        case穿透：
            就是语句体中没有写break导致的
        执行流程：
            首先会拿着小括号中表达式的值跟下面每一个case进行匹配
            如果匹配上了，就执行对应的语句体，如果此时发现了break，那么结束整个switch语句
            如果没有发现break，那么程序会继续执行下一个case的语句体，一直遇到break或者右大括号为止
        使用场景：
            如果多个case的语句体重复了，可以考虑用case穿透去简化代码。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10、20、30其中一个数字");
        int number = sc.nextInt();
        switch(number){
            case 10:
                System.out.println("输入的值为10");
                break;
            case 20:
                System.out.println("输入的值为20");
                //break;
            case 30:
                System.out.println("输入的值为30");
                break;
            default:
                System.out.println("输入的值不是10、20、30");
                //break;
        }
    }
}


