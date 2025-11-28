package com.itheima.ifdemo;

public class IfDemo2 {
    public static void main(String[] args) {
        /*
        if(关系表达式){
            语句体;
        }

        if的注意点：
        1.大括号的左括号写在if关系表达式的末尾
        2.如果语句体只包含一个语句，大括号可以省略
        int number = 200;是两个语句，一个是变量声明语句，一个是赋值语句
        3.如果对boolean类型的值进行判断，不用==号，直接把变量写在小括号里即可
         */

        boolean flag = true;
        if(flag){
            System.out.println("flag的值为true");
        }
    }
}
