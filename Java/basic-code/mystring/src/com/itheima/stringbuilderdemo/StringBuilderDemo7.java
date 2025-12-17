package com.itheima.stringbuilderdemo;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        //1.定义一个int数组
        int[] arr = {1, 2, 3};

        //2.创建一个StringBuilder对象进行字符串拼接
        String result = arrToString(arr);

        //3.打印int数组字符串结果
        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
