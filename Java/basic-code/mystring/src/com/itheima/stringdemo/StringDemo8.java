package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //1.输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        //2.调用方法对字符串进行反转
        String result = reverse(str);
        System.out.println(result);
    }

    public static String reverse(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            newStr += c;
        }
        return newStr;
    }
}
