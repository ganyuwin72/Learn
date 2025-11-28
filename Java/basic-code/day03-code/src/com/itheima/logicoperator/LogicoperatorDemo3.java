package src.com.itheima.logicoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        //1.短路与 &&
        //运行结果与单个&是一样的
        //表示两边都为真，结果才是真
        //左边结果为false，右边不管是真是假，整个表达式的结果一定为false
        System.out.println(true && true); //true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        //2.短路或 ||
        //运行结果跟单个|是一样的
        //表示两边都为假，结果才是假
        //左边结果为true，右边不管是真是假，整个表达式的结果一定为true
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || true); //true
        System.out.println(false || false); //false

        //3.短路逻辑运算符具有短路效果
        //简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 10 && ++b < 10;
        System.out.println(result); //false
        System.out.println(a); //11
        System.out.println(b); //10
    }
}
