package com.itheima.skiploop;

public class SkipLoopDemo1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                //第三个包子有虫，小老虎跳过
                continue;
            }
            System.out.println("小老虎在吃第" + i + "个包子");
        }
    }
}
