//导包
import java.util.Scanner;

public class ScannerDemo2{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入整数a：");
		//接收第一个整数
		int a = sc.nextInt();
		
		System.out.println("请输入整数b：");
		//接收第二个整数	
		int b = sc.nextInt();
		
		//打印计算结果
		System.out.println("a与b的和为：");
		System.out.println(a + b);
	}
}