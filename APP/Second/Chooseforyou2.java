import java.util.Scanner;
public class Chooseforyou2{
	public static void main(String [] args){
		int a,b,c,d;
		System.out.println("������������,ѡ��1��2��3��4��");
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		int q = sc.nextInt();
		int k = sc.nextInt();
		switch(k){
			case 1:
				a=j+q;
				System.out.println("�����ĺ�Ϊ"+a);
				break;
			case 2:
				b=j-q;
				System.out.println("�����Ĳ�Ϊ"+b);
				break;
			case 3:
				c=j*q;
				System.out.println("�����Ļ�Ϊ"+c);
				break;
			case 4:
				d=j/q;
				System.out.println("��������Ϊ"+d);
				break;
			default:
				System.out.println("��������");
		}
	}
}