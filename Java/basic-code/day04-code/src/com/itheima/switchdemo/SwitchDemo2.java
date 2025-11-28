package com.itheima.switchdemo;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/19
 */
public class SwitchDemo2 {
    public static void main(String[] args){
        /*
        default的位置和省略
        位置：可以放在case前、case后任意的位置
        省略：default可以省略
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入10、20、30其中一个数字");
        int number = sc.nextInt();
        switch(number){
            case 10:
                System.out.println("输入的值为10");
                break;
//            default:
//                System.out.println("输入的值不是10、20、30");
//                break;
            case 20:
                System.out.println("输入的值为20");
                break;
            case 30:
                System.out.println("输入的值为30");
                break;
        }
    }
}
