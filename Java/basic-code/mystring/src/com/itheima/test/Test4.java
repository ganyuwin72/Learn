package com.itheima.test;

import java.util.Random;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/17
 */
public class Test4 {
    /*
    需求：生成验证码
    四个字母，大小写均可，一个数字，在任意位置
     */
    public static void main(String[] args) {
        //1.生成字母数组
        char[] letters = generateCharArr();

        //2.随机生成四个字母
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(letters.length);
            char c = letters[randomIndex];
            sb.append(c);
        }

        //3.随机生成一个数字
        int num = r.nextInt(10);
        sb.append(num);

        //4.随机交换数字的位置
        String str = sb.toString();
        char[] arr = str.toCharArray();
        int randomIndex = r.nextInt(5);
        char temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[randomIndex];
        arr[randomIndex] = temp;
        str = new String(arr);
        System.out.println(str);
    }

    public static char[] generateCharArr() {
        char[] letters = new char[52];
        for (int i = 0; i < letters.length; i++) {
            if (i < 26) {
                letters[i] = (char)(i + 'a');
            } else {
                letters[i] = (char)(i - 26 + 'A');
            }
        }
        return letters;
    }
}
