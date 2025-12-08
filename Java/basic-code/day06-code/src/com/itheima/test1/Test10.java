package com.itheima.test1;

public class Test10 {
    //传递引用数据类型时，传递的是地址值，形参的改变，影响实际参数的值
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前：" + arr[1]);
        change(arr);
        System.out.println("调用change方法后：" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}
