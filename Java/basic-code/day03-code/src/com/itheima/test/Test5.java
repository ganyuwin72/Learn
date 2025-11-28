package src.com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class Test5 {
    public static void main(String[] args) {
        /*
        比较三个和尚的身高，获取身高最大值
         */

        //键盘录入三个和尚的身高
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高：");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高：");
        int height3 = sc.nextInt();

        //获取身高最大值
        int maxHeight = (height1 > height2 ? height1 : height2) > height3 ? (height1 > height2 ? height1 : height2) : height3;

        //使用中间值
        int temp = height1 > height2 ? height1 : height2;
        int max = temp > height3 ? temp : height3;

        //打印结果
        System.out.println(maxHeight);
        System.out.println(max);
    }
}
