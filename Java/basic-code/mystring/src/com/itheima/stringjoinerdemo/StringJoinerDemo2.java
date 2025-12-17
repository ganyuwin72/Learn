package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //3.打印
        System.out.println(sj);

        //4.获取长度，这个长度表示字符的个数
        int len = sj.length();
        System.out.println(len);

        //5.转换成字符串
        String str = sj.toString();
        System.out.println(str);
    }
}
