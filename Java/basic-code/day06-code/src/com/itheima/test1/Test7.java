package com.itheima.test1;

public class Test7 {
    //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {12, 34, 766, 45, 96};

        //2.调用方法判断某个数是否存在
        System.out.println(contains(arr, 99));
    }

    public static boolean contains(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}

//return break关键字的区别
//return：其实跟循环没有关系，跟方法有关的，表示1结束方法 2返回结果
//        如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了

//break：跟方法没有什么关系，结束循环或switch的