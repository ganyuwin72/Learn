package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //目标：掌握带参数返回的方法调用格式

        //1.直接调用
        getSum(10,20,30);

        //2.赋值调用
        int result = getSum(10,20,30);
        System.out.println(result);

        //3.输出调用
        System.out.println(getSum(10,20,30));

        //计算公司一年的营业额
        int sum1 = getSum(10,20,30);
        int sum2 = getSum(20,30,40);
        int sum3 = getSum(30,40,50);
        int sum4 = getSum(40,50,60);
        System.out.println("公司一年的营业额为：");
        System.out.println(sum1 + sum2 + sum3 + sum4);
    }

    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
