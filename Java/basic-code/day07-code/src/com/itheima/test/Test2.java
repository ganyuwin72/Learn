package com.itheima.test;

public class Test2 {
    //判断101~200之间有多少个质数，并输出所有素数
    public static void main(String[] args) {
        int count = 0;
        //循环的嵌套
        for(int i = 101; i <= 200; i++){
            boolean flag = true;
            for(int j = 2; j * j <= i; j++){
                if(i % j == 0){
                    flag = false;
                    //跳出单层循环，内循环
                    break;
                }
            }
            if(flag){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println("一共有" + count + "个质数");
    }
}
