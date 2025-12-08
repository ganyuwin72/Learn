package com.itheima.test1;

public class Test8 {
    //定义一个方法copyOfRange(int[] arr, int from, int to)
    //包含from，不包含to
    public static void main(String[] args) {
        int[] arr = {3, 54, 76, 63, 873, 342, 332, 56};
        int[] arrCopy = copyOfRange(arr, 3, 7);
        printArr(arrCopy);
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] arrCopy = new int[to - from];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arr[i + from];
        }
        return arrCopy;
    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
