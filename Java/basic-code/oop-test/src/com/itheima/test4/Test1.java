package com.itheima.test4;

import java.util.Scanner;

public class Test1 {
    //接受数据
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串：");
        String s1 = sc.next();
        System.out.println(s1);
        System.out.println("请输入第二个字符串：");
        String s2 = sc.next();
        System.out.println(s2);

        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二行：");
        String s3 = sc.nextLine();
        System.out.println(s3);

    }
}
