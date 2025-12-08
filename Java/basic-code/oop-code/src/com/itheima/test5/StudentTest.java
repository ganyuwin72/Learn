package com.itheima.test5;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/8
 */
public class StudentTest {

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        Student s2 = new Student("张三", 18);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
    }
}
