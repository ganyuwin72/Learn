package com.itheima.test1;

public class Test4 {
    //目标：设计比较两个整数是否相同的方法
    public static void main(String[] args) {
        byte a1 = 1;
        byte b1 = 2;
        System.out.println(isSame(a1,b1));
        short a2 = 1;
        short b2 = 2;
        System.out.println(isSame(a2,b2));
        int a3 = 1;
        int b3 = 1;
        System.out.println(isSame(a3,b3));
        long a4 = 1L;
        long b4 = 1L;
        System.out.println(isSame(a4,b4));
    }

    public static boolean isSame(byte b1, byte b2){
        return b1 == b2;
    }

    public static boolean isSame(short s1, short s2){
        return s1 == s2;
    }

    public static boolean isSame(int i1, int i2){
        return i1 == i2;
    }

    public static boolean isSame(long n1, long n2){
        return n1 == n2;
    }
}
