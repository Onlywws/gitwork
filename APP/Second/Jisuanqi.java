import java.util.Scanner;
public class Jisuanqi{
	public static void main(String [] args){
		int c,d,e,f;
		System.out.println("���������������������ǵļӼ��˳�");
		Scanner sc = new Scanner(System.in);
		int sca =sc.nextInt();
		int scb =sc.nextInt();
		c=sca+scb;
		d=sca-scb;
		e=sca*scb;
		f=sca/scb;
		System.out.println("���������ļӼ��˳��ֱ���"+c+"\t"+d+"\t"+e+"\t"+f);
	}
}