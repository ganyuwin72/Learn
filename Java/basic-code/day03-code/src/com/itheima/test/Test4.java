package src.com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class Test4 {
    public static void main(String[] args) {
        /**
         * 判断两只老虎的体重是否相同
         */

        //键盘录入两只老虎的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = sc.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = sc.nextInt();

        //输出两只老虎的体重是否相同
        System.out.println(weight1 == weight2 ? "相同" : "不同");
    }
}
