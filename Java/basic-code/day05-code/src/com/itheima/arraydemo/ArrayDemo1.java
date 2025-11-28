package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //格式
        //静态初始化
        //完整格式：
        //数据类型[] 数组名 = new 数据类型[]{元素1,元素2,……};
        //简化格式：
        //数据类型[] 数组名 = {元素1,元素2,……};

        //需求1：定义数组存储5个学生的年龄
        int[] arr1 = new int[]{11,12,13,14,15};
        System.out.println(arr1); //[I@b4c966a
        int[] arr2 = {11,12,13,14,15};
        System.out.println(arr2); //[I@2f4d3709

        //需求2：定义数组存储3个学生的姓名
        String[] arr3 = new String[]{"张三","李四","王五"};
        System.out.println(arr3); //[Ljava.lang.String;@4e50df2e
        String[] arr4 = {"张三","李四","王五"};
        System.out.println(arr4); //[Ljava.lang.String;@1d81eb93

        //需求3：定义数组存储4个学生的身高
        double[] arr5 = new double[]{1.86,1.93,1.74,1.65};
        System.out.println(arr5); //[D@7291c18f
        double[] arr6 = {1.86,1.93,1.74,1.65};
        System.out.println(arr6); //[D@34a245ab  数组的地址值

        //扩展：
        //解释一下地址值的格式含义  [D@b4c966a
        //[ : 表示当前是一个数组
        //D : 表示当前数组里面的元素都是double类型的
        //@ : 表示一个间隔符号。（固定格式）
        //34a245ab : 数组真正的地址值，十六进制
    }
}
