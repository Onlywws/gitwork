import java.util.*;
public class Mima{
	public static void main(String args []){
		System.out.println("��������������");
		int a=0,b=0,c=0,sum=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] x = new char[s.length()];
		for(int i=0;i<s.length();i++){
			x[i] = s.charAt(i);
			if(x[i]>='0' && x[i]<='9'){
				a=1;
			}
			if(x[i]>='A' && x[i]<='z'){
				b=1;
			}
			if(x[i]>=33 && x[i]<=47){
				c=1;
			}
		}
		sum=a+b+c;
		if(sum==3){
			System.out.print("���밲ȫ�ȼ�Ϊ�߼�");
		}else if(sum==2){
			System.out.println("���밲ȫ�ȼ�Ϊ�м�");
		}else if(sum==1){
			System.out.println("���밲ȫ�ȼ�Ϊ�ͼ�");
		}
		
	}
} 
