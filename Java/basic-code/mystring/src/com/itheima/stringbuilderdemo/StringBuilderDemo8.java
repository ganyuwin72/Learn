package com.itheima.stringbuilderdemo;

public class StringBuilderDemo8 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //容量：最多装多少
        //长度：已经装了多少
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0

        sb.append("abc");

        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//3

        //sb.append("defghijklmnopqrstuvwxyz");
        sb.append("defghijklmnopqrstuvwxyz0123456789");

        System.out.println(sb.capacity());//34  36
        System.out.println(sb.length());//26    36
    }
}
