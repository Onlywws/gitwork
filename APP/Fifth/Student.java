public class Student{

	//����������Ϣ
		String name;
		int age;
		char sex;

	public static void main (String [] args){
		Student student[] = new Student[3];
		Student student1 = new Student("lizhengli",20,'��');
		student[0] = student1;
		Student student2 = new Student("lixiang",20,'��');
		student[1] = student2;
		Student student3 = new Student("zhouhongcheng",20,'��');
		student[2] = student3;
		for(int i=0;i<student.length;i++){
			student[i].say();
			student[i].sleep();
		}
	}

	

	//����
	public void eat(){			
		System.out.println(name+"Eating");
	}
	public void drink(){
		System.out.println(name+"is Drinking");
	}
	public void run(){
		System.out.println(name+"is Running");
	}
	public void sleep(){
		System.out.println(name+"is Sleepping");
	}
	public void say(){
		System.out.println("�ҽ�"+name+",����"+age+"�꣬�Ա�"+sex);
	}

	//������
	public Student(String name,int age,char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

}