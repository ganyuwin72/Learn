package com.itheima.infiniteloop;

public class InfiniteloopDemo1 {
    //无限循环
    public static void main(String[] args) {
        //for格式的无限循环
//        for(;;){
//            System.out.println("学习");
//        }

        //while格式的无限循环
        while(true){
            System.out.println("学习");
        }
        //System.out.println("学习完了");
        //无限循环下面不能再写其他代码了，因为循环永远停不下来，下面的代码永远执行不到
    }
}
