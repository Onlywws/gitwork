public class EnumClass{
	public static void  main(String [] args ){
		EnumDemo ed = EnumDemo.ON;
		System.out.println(ed);//ȡֵ
		System.out.println(ed.name());//����ö����ʵ������
		System.out.println(ed.ordinal());//����ö�ٵ�����
	}
}

//����ö����
enum EnumDemo{
	ON,OFF  //�൱�ڶ�����ֶ�
}

