public class School{
	public static void main(String[]args){
		Schoolclass [] a = new Schoolclass[3];
		Schoolclass school1 = new Schoolclass("���ʵ�ʮ����ѧ",6666,"��ѧ¥");
		a[0] = school1;
		Schoolclass school2 = new Schoolclass("���ʵ�ʮ����ѧ",5555,"����¥");
		a[1] = school2;
		Schoolclass school3 = new Schoolclass("ɽ����ͨ��ʦѧԺ",4444,"����");
		a[2] = school3;

		for(int i=0;i<a.length;i++){
			a[i].speak();
			a[i].after();
		}

	}
}