package com.itheima.arraydemo;

public class ArrayDemo4 {
    //定义数组，存班级50个学生的姓名

    //格式：
    //数据类型[] 数据名 = new 数据类型[数组的长度];
    //在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
    public static void main(String[] args) {
        String[] arr = new String[50];
        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";
        //获取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]); //打印出来的是默认初始化值null

        //数组默认初始化的规律
        //整数类型：byte,short,int,long,默认初始化值为0
        //小数类型：float,double,默认初始化值0.0
        //字符类型：默认初始化值'\u0000' 空格
        //布尔类型：默认初始化值 false
        //引用数据类型：默认初始化值 null

        int arr2[] = new int[3];
        System.out.println(arr2[0]);//0
        System.out.println(arr2[1]);//0
        System.out.println(arr2[2]);//0
    }
}
