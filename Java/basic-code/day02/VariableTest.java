public class VariableTest{
	public static void main(String[] args){
		int count = 0;
		//第1站
		count = count + 1;
		//第2站
		count = count + 2 - 1;
		//第3站
		count = count + 2 - 1;
		//第4站
		count = count - 1;
		//第5站
		count = count + 1;
		//终点站
		System.out.println(count);
	}
}