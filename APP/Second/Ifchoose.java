import java.util.Scanner;
public class Ifchoose{
	public static void main(String[]args){
		int a;
		System.out.println("������������Ȼ��ѡ������ǽ���1��2��3��4������");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int q = sc.nextInt();
		int k = sc.nextInt();
		if(k==1){
			a=j+q;
			System.out.println("�����ĺ�Ϊ"+a);
		}
		if(k==2){
			a=j-q;
			System.out.println("�����Ĳ�Ϊ"+a);
		}
		if(k==3){
			a=j*q;
			System.out.println("�����Ļ�Ϊ"+a);
		}
		if(k==4){
			a=j/q;
			System.out.println("��������Ϊ"+a);
		}
		if(k>4){
			System.out.println("��������");
		}
	}
}