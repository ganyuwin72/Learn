package com.itheima.test;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/17
 */
public class Test5 {
    /*
    需求：
    给两个字符串形式的数字，返回他们的乘积，返回结果也是整数的形式
     */
    public static void main(String[] args) {
        //1.定义两个数字字符串
        String str1 = "123";
        String str2 = "123";

        //2.将数字字符串转换为int型整数
        int num1 = str2Int(str1);
        int num2 = str2Int(str2);
        int numResult = num1 * num2;
        String strResult = numResult + "";

        //3.打印最终结果
        System.out.println(strResult);


    }

    public static int str2Int(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            result = result * 10 + num;
        }
        return result;
    }
}
