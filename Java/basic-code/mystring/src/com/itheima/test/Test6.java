package com.itheima.test;

import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/17
 */
public class Test6 {
    /*
    需求：返回句子的最后一个单词的长度
     */
    public static void main(String[] args) {
        //1.键盘录入一个英文句子
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个英文句子：");
        String sentence = sc.nextLine();

        //2.倒着遍历句子，直到出现空格
        int count = 0;
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }

        //3.打印结果
        System.out.println("最后一个单词长度为：" + count);
    }
}
