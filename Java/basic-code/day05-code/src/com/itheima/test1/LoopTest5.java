package com.itheima.test1;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        //1.导包
        //2.创建对象
        Random r = new Random();
        //3.生成随机数
        //小括号是生成随机数的范围
        //这个范围从0开始，到这个数-1结束
        //口诀：包头不包尾，包左不包右
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(100);
            System.out.println(number);
        }
    }
}
