package com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/17
 */
public class Test2Case1 {
    /*
    需求：判断字符串A能否经过若干次旋转操作变为字符串B
    旋转操作的定义：将字符串最左边的字符放到字符串的最右边
    字符串操作的两种方法：
    1.substring进行字符串截取
    2.将字符串转换为字符数组进行操作，最后再变成字符串
     */
    public static void main(String[] args) {
        //1.键盘录入字符串A和字符串B
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串A：");
        String strA = sc.next();
        System.out.println("请输入字符串B：");
        String strB = sc.next();

        //2.对字符串进行有限次旋转操作，判断是否与字符串B相同
        boolean flag = false;
        for (int i = 0; i < strA.length(); i++) {
            strA = strA.substring(1) + strA.charAt(0);
            if (strA.equals(strB)) {
                flag = true;
                break;
            }
        }

        //3.输出打印结果
        if (flag) {
            System.out.println("字符串A和字符串B是对称字符串");
        } else {
            System.out.println("字符串A和字符串B不是对称字符串");
        }
    }

    //定义方法进行字符串的旋转
    public static String spinStr(String str) {
        //一行干脆不封装了
        String newStr = str.substring(1) + str.charAt(0);
        return newStr;
    }
}
