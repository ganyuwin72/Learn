package src.com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class Test3 {
    public static void main(String[] args) {
        /*
        输入两个数字，其中有一个为6，或者二者的和为6，则返回true
        否则返回false
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int number2 = sc.nextInt();

        //判断结果
        boolean result = number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0;
        System.out.println(result);
    }
}
