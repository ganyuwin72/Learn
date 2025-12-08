package com.itheima.test1;

public class Test3 {
    public static void main(String[] args) {
        //比较两个长方形的面积
        double area1 = getArea(3.3, 33.3);
        double area2 = getArea(12.3, 33.32);
        System.out.println(area1 > area2 ? "第一个长方形面积大" : "第二个长方形面积大");
    }

    public static double getArea(double len, double width){
        double area = len * width;
        return area;
    }
}
