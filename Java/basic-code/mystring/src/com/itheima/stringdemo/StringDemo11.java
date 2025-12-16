package com.itheima.stringdemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "123342200312024520";

        //2.从字符串中获取生日与性别信息
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        String birthday = year + "年" + month + "月" + day + "日";
        char genderInfo = id.charAt(16);
        char gender;
        if ((genderInfo - '0') % 2 == 0) {
            gender = '女';
        } else {
            gender = '男';
        }

        //3.输出生日与性别信息
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + birthday);
        System.out.println("性别为：" + gender);
    }
}
