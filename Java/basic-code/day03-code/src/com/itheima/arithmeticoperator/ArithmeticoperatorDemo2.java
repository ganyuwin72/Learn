package src.com.itheima.arithmeticoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/8
 */
public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println(30 / 5); //6
        System.out.println(30 / 7); //4
        System.out.println(30.0 / 5); //6.0
        System.out.println(30.0 / 7); //4.285714285714286

        //取余
        System.out.println(20 % 5); //0
        System.out.println(20 % 3); //2
        //取余的应用场景：
        //1.可以用取余来判断A是否可以被B整除
        //2.用2取余判断一个数字是不是整数
        //3.斗地主发牌游戏，余0余1余2分别发给三个玩家
    }
}
