package src.com.itheima.assigningoperator;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/11/9
 */
public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //+=
        //规则：将左边和右边进行相加，然后把结果赋值给左边
        int a = 10;
        int b = 20;
        //把a + b，再把结果赋值给a
        //等同于：a = (int)(a + b);
        a += b;
        System.out.println("a的值是：" + a); //30
        System.out.println("b的值是：" + b); //20

        //细节：
        //+=,-=,*=,/=,%=底层都隐藏了一个强制类型转换
        short s = 1;
        //把左边和右边的值相加，得到结果2，再赋值给左边的变量
        //等同于：s = (short)(s + 1);
        s += 1;
        System.out.println("s的值是：" + s); //2

    }
}
