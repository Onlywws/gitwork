public class Wangzhe{
	public static void main(String args[]){
		Rongyao [] a = new Rongyao[3];
		Rongyao hero1 = new Rongyao("����","սʿ","rou");
		a[0] = hero1;
		Rongyao hero2 = new Rongyao("���","�̿�","AD");
		a[1] = hero2;
		Rongyao hero3 = new Rongyao("�����","սʿ","AD");
		a[2] = hero3;

		for (int i=0;i<a.length;i++)
		{
			a[i].speak();
			a[i].jineng();
		}
	}
}