package com.itheima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存入女朋友的对象
        GirlFriend[] arr = new  GirlFriend[4];

        //2.创建女朋友对象
        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "玩游戏");
        GirlFriend gf3 = new GirlFriend("小慧慧", 20, "萌妹子", "看书，学习");
        GirlFriend gf4 = new GirlFriend("小莉莉", 21, "憨妹子", "睡觉");

        //3.把对象添加到数组当中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 索引  arr[i] 元素
            sum += arr[i].getAge();
        }

        //5.求年龄的平均值
        int avg = sum / arr.length;

        //6.打印年龄比平均值小的女朋友
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].toString());
                count++;
            }
        }
        System.out.println("共有" + count + "个女朋友年龄比平均值小");
    }
}
