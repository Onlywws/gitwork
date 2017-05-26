import java.util.*;

public class Update{
	
	static Update [] wws = new Update[100];//��������
	static int i = 0; 

	private static String studentname;
	private static int studentage;
	private static String studentsex;

	public static void main(String args[]){
		diaoyong();
	}//������

	public static void diaoyong(){
		Scanner sc = new Scanner(System.in);
		System.out.println("------*****�˵�*****------");
		System.out.println("-----ѡ������Ҫ�Ĳ���-----");
		System.out.println("----------1.����----------");
		System.out.println("----------2.ɾ��----------");
		System.out.println("----------3.����----------");
		System.out.println("----------4.�޸�----------");
		System.out.println("----------5.�˳�----------");
		int a = sc.nextInt();
			switch(a){
				case 1:
					addstudent();
					break;
				case 2:
					deletestudent();
					break;
				case 3:
					selectstudent();
					break;
				case 4:
					updatestudent();
					break;
				case 5:
					exitstudent();
					break;
				default:
					System.out.println("��������");
			}
	}
		//����������
		public static void addstudent(){
			boolean flag = true;
			while(flag){
				Scanner sc = new Scanner(System.in);
				System.out.println("������ѧ������:");
				String studentname = sc.next();
				System.out.println("������ѧ������:");
				int studentage = sc.nextInt();
				System.out.println("������ѧ���Ա�:");
				String studentsex = sc.next();

				Update student = new Update(studentname,studentage,studentsex);
				wws[i]= student;
				wws[i].speak();
				i++;
				System.out.println("------1.¼�����,����-----");
				System.out.println("------2.���ز˵�----------");
				int f = sc.nextInt();
				if(f==1){
					flag=true;
				}else if(f==2){
					flag=false;
				}else{
					System.out.println("��������");
					
				}
			}
			diaoyong();
		}
		
		//������ɾ��
		public static void deletestudent(){
			Scanner sc = new Scanner(System.in);
			System.out.println("===1.��ȷɾ��===");
			System.out.println("===2.ȫ��ɾ��===");
			int m = sc.nextInt();
			if(m==1){
			System.out.println("������ɾ��������");
			String d = sc.next();
			for(int o=0;o<wws.length;o++){		
				if(wws[o]!=null && d.equals(wws[o].studentname)){
					wws[o]=null;
					System.out.println("===ɾ���ɹ�===");
				}
			}
				System.out.println("===1.����ɾ��===");
				System.out.println("===2.���ز˵�===");
				int l = sc.nextInt();
				if(l==1){
					deletestudent();
				}else if(l==2){
					diaoyong();
				 }
			}
			if(m==2){
				for(int o=0;o<wws.length;o++){
					if(wws[o]!=null){
						wws[o]=null;
					}
				}
			}
			System.out.println("���ز˵�");
			diaoyong();
		}
			

		//����������
		public static void selectstudent(){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("----1.��ȷ��ѯ----");
			System.out.println("----2.ȫ����ѯ----");
			int j = sc.nextInt();
			if(j==1){
				System.out.println("������Ҫ��ѯ������");
				String xingming = sc.next();
				for(Update s:wws){
					if(s !=null && xingming.equals(s.studentname) ){
						s.speak();
					}
		
				}
			}else if(j==2){
				for(Update s:wws){
					if(s!=null ){
						s.speak();
					}
				}
			}
				
			System.out.println("--------1.������ѯ----------");
			System.out.println("--------2.���ز˵�----------");
			int h = sc.nextInt();
			if(h==1){
				selectstudent();
			}else if(h==2){
				diaoyong();
			}else{
				System.out.println("��������");
			}
			
		}

		//����������
		public static void updatestudent(){
			Scanner sc = new Scanner(System.in);
			System.out.println("===������Ҫ�޸ĵ�����==");
			String newname = sc.next();
			for(int p=0;p<wws.length;p++){
				if(wws[p]!=null && newname.equals(wws[p].studentname)){
					System.out.println("������ѧ������:");
					String name = sc.next();
					System.out.println("������ѧ������:");
					int age = sc.nextInt();
					System.out.println("������ѧ���Ա�:");
					String sex = sc.next();
					Update student = new Update(name,age,sex);
					wws[p] = student;
					System.out.println("�޸ĳɹ�");
				}else{
					System.out.println("û���������ѧ�������ϣ�����������");
				}
				System.out.println("===1.�����޸�===");
				System.out.println("===2.���ز˵�===");
				int l = sc.nextInt();
				if(l==1){
					updatestudent();
				}else if(l==2){
					diaoyong();
				 }
			}
			diaoyong();
		}

		//�������˳�
		public static void exitstudent(){
			System.out.println("ByeBye!");
		}

		//���������
		public static void speak(){
			System.out.println("���ֽ�"+studentname+","+studentage+"�꣬�Ա�"+studentsex);
		}

		//������
		public Update(String studentname,int studentage,String studentsex){
			this.studentname=studentname;
			this.studentage=studentage;
			this.studentsex=studentsex;
		}

}
/*

*/