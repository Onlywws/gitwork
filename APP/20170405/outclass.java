class Demo
{
	public static void main(String [] args){
		outClass oc = new outClass();
		oc.show();
	}
}
class  outclass{
	private String name = "����";
	class innerclass{
		public void say(){
			System.out.println("�����ڲ������"+name);
		}
	}
	public void show(){
		innerClass ic = new innerClass();
		ic.say();
	}
}