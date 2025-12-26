package com.itheima.listdemo;
import java.util.ArrayList;

/*
    boolean add(E e): 添加元素，返回值代表添加是否成功
        备注：一般情况下添加元素都是成功的，所以返回值可用可不用
    
    boolean remove(E e): 删除指定元素，返回值代表删除是否成功
    E remove(int index)

    E set(int index, E e): 修改

    E get(int index): 获取指定位置的元素
    int size(): 获取集合的长度
*/
public class ArrayListDemo2 {
    public static void main(String[] args) {
        // 1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        // 2.添加元素
        boolean result1 = list.add("aaa");
        System.out.println(result1); // true
        System.out.println(list); // [aaa]

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        // 3.删除元素
        boolean result2 = list.remove("aaa");
        System.out.println(result2);

        boolean result3 = list.remove("eee");
        System.out.println(result3);

        String str = list.remove(1);
        System.out.println(str);

        // 4.

        System.out.println(list);
    }
}