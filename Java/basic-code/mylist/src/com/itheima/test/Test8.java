package com.itheima.test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        // 1.创建集合对象
        ArrayList<Phone> list = new ArrayList<>();

        // 2.创建手机的对象
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("华为", 8000);
        Phone p3 = new Phone("锤子", 2999);

        // 3.添加数据
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // 4.返回价格不大于price的手机对象
        ArrayList<Phone> resultList = getPhoneByPrice(list, 3000);
        for (int i = 0; i < resultList.size(); i++) {
            Phone p = resultList.get(i);
            System.out.println(p.getBrand() + ", " + p.getPrice());
        }
    }

    // 技巧：
    // 如果我们要返回多个数据，可以把这些数据先放到一个容器当中，再把容器返回
    public static ArrayList<Phone> getPhoneByPrice(ArrayList<Phone> list, int price) {
        ArrayList<Phone> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() <= price) {
                resultList.add(list.get(i));
            }
        }
        return resultList;
    }
}
