package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    //计算季度和年份的营业额
    public static void main(String[] args) {
        int[][] yearArrArr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int yearSum = 0;
        for (int i = 0; i < yearArrArr.length; i++) {
            int sum = getSum(yearArrArr[i]);
            yearSum += sum;
            System.out.println("第" + (i + 1) + "季度的营业额为：" + sum);
        }
        System.out.println("一年的营业额为：" + yearSum);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
