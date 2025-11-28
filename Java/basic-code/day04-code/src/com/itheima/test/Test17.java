package com.itheima.test;

public class Test17 {
    public static void main(String[] args) {
        //折叠纸张到珠穆朗玛峰的高度
        //1.定义变量记录珠穆朗玛峰的高度
        double height = 8844430;
        //2.定义变量记录纸张的厚度
        double paper = 0.1;
        //3.定义变量统计折叠的次数
        int count = 0;
        //4.循环折叠纸张，只要纸张的厚度小于山峰的高度，循环就继续
        while(paper < height){
            paper *= 2;
            count++;
        }
        //循环结束之后，count记录的值就是折叠的次数
        System.out.println("需要折叠" + count + "次");
    }
}
