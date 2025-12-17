package com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/17
 */
public class Test1Case1 {
    /*
    需求：
    输入一个9位以内的数字，输入中不能包含字符，将数字变成罗马数字的形式
     */
    public static void main(String[] args) {
        //1.键盘录入输入的数字
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入数字：");
            //2.判断数字是否为合法输入
            str = sc.next();
            boolean flag = checkInput(str);
            if (flag) {
                break;
            } else {
                System.out.println("非法输入，请输入长度不大于9的数字串");
            }
        }

        //3.创建一个新的字符串存储转换后的结果
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(changeLuoMa(c));
        }

        //4.打印最终结果
        System.out.println(sb);
    }

    //定义数组，将阿拉伯数字与罗马数字对应起来
    public static String changeLuoMa(char c) {
        String str = switch (c) {
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> "";
        };
        return str;
    }

    public static boolean checkInput(String str) {
        //输入长度不能大于9
        if (str.length() > 9) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }
}
