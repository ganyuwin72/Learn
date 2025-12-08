package com.itheima.test1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //会员打折

        //1.键盘录入商品总价
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买商品总价：");
        int price = sc.nextInt();

        //2.键盘录入会员等级
        System.out.println("请输入会员等级：");
        int vip = sc.nextInt();

        //3.根据会员等级计算价格
        if(vip == 1){
            System.out.println("一级会员，需付款" + price * 0.9 + "元");
        }else if(vip == 2){
            System.out.println("二级会员，需付款" + price * 0.8 + "元");
        }else if(vip == 3){
            System.out.println("三级会员，需付款" + price * 0.7 + "元");
        }else{
            System.out.println("非会员，需付款" + price + "元");
        }
    }
}
