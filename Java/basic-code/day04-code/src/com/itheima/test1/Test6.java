package com.itheima.test1;

import java.util.Scanner;

public class Test6 {
    //小明的考试成绩
    public static void main(String[] args) {
        //1.键盘录入小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的考试成绩：");
        int score = sc.nextInt();

        //2.判断小明的成绩范围：
        if(score >= 0 && score <= 100){
            if(score >= 95){
                System.out.println("送一辆自行车");
            }else if(score >= 90){
                System.out.println("游乐场玩一天");
            }else if(score >= 80){
                System.out.println("送变形金刚一个");
            }else{
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("录入的成绩不在合法范围内");
        }
    }
}
