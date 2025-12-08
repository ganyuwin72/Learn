package com.itheima.test5;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/8
 */
public class Student {
    String name;
    int age;

    //如果我们自己没有写任何的构造方法
    //那么虚拟机会给我们加一个空参的构造方法
    public Student() {
        System.out.println("看看我执行了吗？");
    }

    //如果写了带参的构造方法，还想使用空参的形式创建对象
    //就必须在类中定义空参创建对象的方法，否则代码会报错
    //即：如果定义了构造方法
    //系统将不再给出无参的默认的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
