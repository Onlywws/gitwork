public class Huoche2{
	public static void main(String[] args){
		Huoche2 firstcar = new Huoche2("������",100,88888);
		Huoche2 secondcar = new Huoche2("����",200,66666);
		firstcar.say();
		secondcar.say();
		firstcar.running();
		firstcar.let();
		secondcar.hit();
	}

	String name;
	int howlang;
	int howmany;

	public void running(){
		System.out.println("�ܿ�");
	}
	public void let(){
		System.out.println("����");
	}
	public void hit(){
		System.out.println("װ��");
	}
	public void say(){
		System.out.println(name+"�Ż𳵣�"+"��"+howlang+"�ף�����"+howmany+"��");
	}

	//������
	public Huoche2(String name,int howlang,int howmany){
		this.name=name;
		this.howlang=howlang;
		this.howmany=howmany;
	}
}