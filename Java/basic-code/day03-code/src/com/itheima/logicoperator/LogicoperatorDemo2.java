package src.com.itheima.logicoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        //1.^ 异或
        //相同为false，不同为true
        System.out.println(true ^ true); //false
        System.out.println(true ^ false); //true
        System.out.println(false ^ true); //true
        System.out.println(false ^ false); //false

        //2.! 非
        //取反
        System.out.println(!true); //false
        System.out.println(!false); //true
    }
}
