package com.itheima.test;

import java.util.ArrayList;

public class Test7 {
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

        // 4.根据用户ID查找索引
        int index = getIndex(list, "heima001");
        System.out.println(index);
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean containsUserById(ArrayList<User> list, String id) {
        // for (User user : list) {
        //     if (user.getId().equals(id)) {
        //         return true;
        //     }
        // }
        // return false;
        return getIndex(list, id) >= 0;
    }
}