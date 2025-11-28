package com.itheima.switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //晚饭吃什么面

        //1.定义变量记录想吃的面
        String noodles = "武汉热干面";

        //2.使用switch语句进行匹配
        switch(noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
