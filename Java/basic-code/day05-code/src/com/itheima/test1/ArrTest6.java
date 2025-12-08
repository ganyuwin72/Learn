package com.itheima.test1;

public class ArrTest6 {
    public static void main(String[] args) {
        //定义两个变量，交换两个变量记录的值

        int a = 0;
        int b = 1;

        //定义一个临时的第三方变量
        //把变量a的值赋值给temp
        int temp = a;
        //把变量b的值赋值给a
        a = b;
        //把变量a原来的值赋值给变量b
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
