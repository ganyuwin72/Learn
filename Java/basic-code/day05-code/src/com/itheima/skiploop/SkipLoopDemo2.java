package com.itheima.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.println("小老虎在吃第" + i + "个包子");
            if(i == 3){
                //小老虎吃三个包子就饱了
                break;
            }
        }
    }
}
