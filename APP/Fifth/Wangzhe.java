public class Wangzhe{
	public static void main(String args[]){
		Rongyao [] a = new Rongyao[3];
		Rongyao hero1 = new Rongyao("赵云","战士","rou");
		a[0] = hero1;
		Rongyao hero2 = new Rongyao("李白","刺客","AD");
		a[1] = hero2;
		Rongyao hero3 = new Rongyao("孙悟空","战士","AD");
		a[2] = hero3;

		for (int i=0;i<a.length;i++)
		{
			a[i].speak();
			a[i].jineng();
		}
	}
}