package src.com.itheima.logicoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1.& 与
        //两边都为true，结果才为true
        //ctrl+D，复制这一行
        System.out.println(true & true); //true
        System.out.println(true & false); //false
        System.out.println(false & true); //false
        System.out.println(false & false); //false

        //2.| 或
        //两边都为false，结果才为false
        System.out.println(true | true); //true
        System.out.println(true | false); //true
        System.out.println(false | true); //true
        System.out.println(false | false); //false
    }
}
