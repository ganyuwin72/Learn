package src.com.itheima.arithmeticoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class ArithmeticoperatorDemo6 {
    public static void main(String[] args) {
        int x = 10;
        //后++：先用后加
        //先把x里的值拿出来用，赋值给y，再进行自增运算
        //赋值给y的值是自增前的
        int y = x++;
        //先++：先加后用
        /*先把x进行自增，然后把自增后的结果赋值给左边的变量
        *先把x自增，变成12，然后再把自增后的12赋值给z*/
        int z = ++x;
        System.out.println("x的值：" + x);
        System.out.println("y的值：" + y);
        System.out.println("z的值：" + z);
    }
}
