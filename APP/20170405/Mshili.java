public class Mshili{
	public static void main(String [] args){
		Singleton.print();
	}
}

enum Singleton{
	INSTANCE;//Ψһʵ��

	public void print(){
		System.out.println("ʹ��enumʵ�ֵ���ģʽ");
	}
	public static Singleton getInstance(){
		return INSTANCE;
	}
}
