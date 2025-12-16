package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "17459870916";

        //2.截取手机号码前面三位
        String start = phoneNumber.substring(0, 3);

        //3.截取手机号码后面四位
        //从第七位开始一直截取到末尾
        String end = phoneNumber.substring(7);

        //4.将得到的前三位和后四位手机号进行拼接
        String result = start + "****" + end;

        //5.打印隐藏之后的手机号
        System.out.println(result);
    }
}
