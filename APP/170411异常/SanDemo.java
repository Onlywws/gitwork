import java.util.*;
public class SanDemo{
	public static void main(String [] args) throws Exception{
		SanDemo w = new SanDemo();
		try{
			w.out();
		}catch(Exception p){
			p.printStackTrace();
			System.out.println("�쳣��Ϣ");
		}
	}
	
	public void out()throws MyException{
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ���߱߳�");
		int a = sc.nextInt();
		System.out.println("������ڶ����߱߳�");
		int b = sc.nextInt();
		System.out.println("������������߱߳�");
		int c = sc.nextInt();
		if (a+b>c && a+c>b && b+c>a){
			System.out.println("���Թ���������");
		}
		else{
			throw new MyException("�����Թ���������");
		}
	}
}

class MyException extends Exception{
    public MyException() {
        super();
    }    
    public MyException(String message){
        super(message);
    }
}