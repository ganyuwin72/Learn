package src.com.itheima.arithmeticoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        int result1 = b1 + b2;
        byte result2 = (byte)(b1 + b2);
        System.out.println(result1); //200
        System.out.println(result2); //-56
    }
}
