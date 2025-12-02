package com.itheima.test;

import java.util.Random;

public class Test3 {
    //目标：开发验证码
    //前四位是大写字母或者小写字母，第五位是数字

    //如何实现字母的随机？
    //一堆没有规律的数据中随机抽取：使用数组索引
    //先将这些数据放到一个数组中，再随机抽取一个索引
    public static void main(String[] args) {
        //把大写字母和小写字母都放到字母的数组当中
        char[] letter = new char[52];
        for (int i = 0; i < letter.length; i++) {
            if (i <= 25) {
                //a --- 97
                letter[i] = (char) ('a' + i);
            } else {
                //A --- 65
                letter[i] = (char) ('A' + i - 26);
            }
        }
//        for (int i = 0; i < letter.length; i++) {
//            System.out.print(letter[i]);
//        }
        Random r = new Random();
        //定义一个字符串类型的变量，来记录最终的验证码
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(letter.length);
            result += letter[randomIndex];
        }
        result += r.nextInt(10);
        System.out.println(result);

        /*
        char[] letter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
                'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        //把0~9放到数字数组中
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        Random rand = new Random();

        char[] code = new char[5];
        //随机生成前四个字母
        for (int i = 0; i < code.length - 1; i++) {
            code[i] = letter[rand.nextInt(letter.length)];
        }
        //随机生成最后一个数字
        code[code.length - 1] = (char)(rand.nextInt((int)'0', (int)'9'));
        //打印验证码
        for (int i = 0; i < code.length; i++) {
            System.out.print(code[i]);
        }
        */
    }
}
