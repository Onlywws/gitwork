import java.util.*;
public class IntegerDemo{
	public static void main(String [] args) throws Exception{
		int [] ed = new int[5];
		try{
			IntegerDemo fc = new IntegerDemo();
			fc.out();
		}catch(Exception v){
			System.out.println("异常信息");
			//System.out.println(v.toString());
			//System.out.println(v.getMessage());
			//v.printStackTrace();
			throw new Exception("输入的不是整数");
		}	
	}

	public static void out(){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入整数");
		int a = sc.nextInt();
	}
}