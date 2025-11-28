//1.导包，找到Scanner这个类在哪儿
//书写要注意：要写在类定义的上面
import java.util.Scanner;

public class ScannerDemo1{
	public static void main(String[] args){
		//2.创建对象，表示现在我要开始使用Scanner这个类
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入整数");
		
		//3.接收数据
		int i = sc.nextInt();
		
		//4.打印输出
		System.out.println(i);
	} 
}