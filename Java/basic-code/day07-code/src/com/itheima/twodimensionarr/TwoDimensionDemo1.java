package com.itheima.twodimensionarr;

public class TwoDimensionDemo1 {
    //二维数组
    public static void main(String[] args) {
        //1.二维数组的静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //建议把每一个一维数组单独写成一行，每个一维数组之间需要用逗号隔开
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };
        //2.获取元素
        System.out.println("获取元素：");
        System.out.println(arr3[0]);    //[I@b4c966a
        System.out.println(arr3[0][0]); //1
        System.out.println(arr3[1][4]); //8
        //System.out.println(arr3[2][1]); //ArrayIndexOutOfBoundsException
        //3.二维数组遍历
        System.out.println("遍历二维数组：");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr3[i].length; j++) {
                if (j == arr3[i].length - 1) {
                    System.out.print(arr3[i][j]);
                } else {
                    System.out.print(arr3[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
    }
}
