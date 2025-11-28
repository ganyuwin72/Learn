package src.com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/8
 */
public class Test1 {
    public static void main(String[] args) {
        //输入：一个三位数
        //输出：这个三位数的个位、十位、百位

        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位整数：");
        int number = sc.nextInt();

        //分别输出个位、十位、百位
        System.out.println("个位是："+ number % 10);
        System.out.println("十位是：" + number / 10 % 10);
        System.out.println("百位是：" + number / 10 / 10 % 10);
    }
}
