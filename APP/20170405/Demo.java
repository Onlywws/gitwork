class Demo{
	public static void main(String [] args){
		outClass oc = new outClass();
		oc.show();
	}
}
class outClass{
	private String name = "����";
	class innerClass{
		public void say(){
			System.out.println("�����ڲ������"+name);
		}
	}
	public void show(){
		innerClass ic = new innerClass();
		ic.say();
	}
}