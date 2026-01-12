package com.itheima.test;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<User> list = new ArrayList<>();

        // 2.创建用户对象
        User user1 = new User("heima001", "zhangsan", "123456");
        User user2 = new User("heima002", "lisi", "12345678");
        User user3 = new User("heima003", "wangwu", "123qwer");

        // 3.添加用户对象到集合中
        list.add(user1);
        list.add(user2);
        list.add(user3);

        // 4.通过id查找对象是否在集合中
        boolean flag = containsUserById(list, "heima005");
        System.out.println(flag);
    }

    public static boolean containsUserById(ArrayList<User> list, String id) {
        for (User user : list) {
            if (user.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
