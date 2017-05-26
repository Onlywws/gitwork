/*
public class ExceptionDemo{
	public static void main(String [] args){
		ExceptionDemo ed = new ExceptionDemo();
		ed.add();
	}

	public void add(){
		int num1 = 0;
		int num2 = 33;
		try{
			int num3 = num2/num1;
		}catch(ArithmeticException a){
			System.out.println("��ѧ�������");
			System.out.println(a.toString());     //��ȡ�쳣����
			System.out.println(a.getMessage());   //��ȡ�쳣��Ϣ
			a.printStackTrace();                  //��ӡ�쳣�ڶ�ջ�еĸ�����Ϣ
		}catch(Exception b){
			System.out.println("���쳣");
		}finally{
			System.out.println("���������ֵ");
		}
	}

}
*/

public class ExceptionDemo{
	public static void main(String [] args){
		try{
			add();
		}catch(ArithmeticException a){
			System.out.println("��ѧ�������");
			System.out.println(a.toString());     //��ȡ�쳣����
			System.out.println(a.getMessage());   //��ȡ�쳣��Ϣ
			a.printStackTrace();                  //��ӡ�쳣�ڶ�ջ�еĸ�����Ϣ
		}catch(Exception b){
			System.out.println("���쳣");
		}finally{
			System.out.println("���������ֵ");
		}
	}

	public static void add() throws ArithmeticException{
		int num1 = 0;
		int num2 = 33;
		int num3 = num2/num1;
	}
}