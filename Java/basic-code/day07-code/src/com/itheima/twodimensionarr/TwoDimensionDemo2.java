package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    //二维数组的动态初始化
    public static void main(String[] args) {
        //1.利用动态初始化格式创建二维数组
        int[][] arr = new int[3][5];
        //给二维数组赋值一个元素
        arr[0][0] = 10;
        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) {
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
    }
}
