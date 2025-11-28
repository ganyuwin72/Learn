package src.com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class Test2 {
    public static void main(String[] args) {
        /**
         * 判断相亲是否成功
         * 时髦度大于相亲对象的时髦度，则相亲成功
         */

        //1.键盘录入两个整数表示衣服的时髦度
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的时髦度：");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度：");
        int girlFashion = sc.nextInt();

        //2.把你的衣服的时髦度和相亲对象的时髦度进行对比
        boolean result = myFashion > girlFashion;

        //3.输出结果
        System.out.println(result);

    }
}
