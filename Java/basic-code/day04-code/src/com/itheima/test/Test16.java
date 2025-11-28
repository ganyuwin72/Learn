package com.itheima.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        //统计键盘录入两个数字中既能被3整除又能被5整除的数的范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个整数表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个整数表示范围的结束");
        int end = sc.nextInt();
        int count = 0;
        for(int i = start; i <= end; i++){
            if(i % 3 == 0 && i % 5 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
