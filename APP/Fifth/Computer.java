public class Computer
{
	public static void main(String [] args){
		Dinanao [] a = new Dinanao[3];
		Dinanao computer1 = new Dinanao("��е����",5000,"windows","MSI");
		a[0] = computer1;
		Dinanao computer2 = new Dinanao("����",5000,"windows","����");
		a[1] = computer2;
		Dinanao computer3 = new Dinanao("��Ӱ����",5000,"windows","HP");
		a[2] = computer3;

		for (int i=0;i<a.length;i++)
		{
			a[i].speak();
			a[i].funcation();
		}

	}
}