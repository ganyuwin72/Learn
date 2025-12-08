package com.itheima.test1;

public class Test8 {
    public static void main(String[] args) {
        //自动驾驶
        //交通信号灯

        //1.定义三个boolean类型的变量记录灯的状态
        //true表示亮，false表示灭
        boolean isLightGreen = true;
        boolean isLightYellow = false;
        boolean isLightRed = false;

        //2.使用if语句判断灯是否亮
        if(isLightGreen){
            System.out.println("gogogo!!!");
        }else if(isLightYellow){
            System.out.println("slow!!!");
        }else if(isLightRed){
            System.out.println("stop!!!");
        }
    }
}