class SnakeDemo {
	private String name = "�ⲿ������";
	private class Node {
		private String name="�ڲ�������";
		public void  addTail(){
			String name ="�ֲ�����";
			System.out.println("��"+name+"���ӵ�β��");
			System.out.println("��"+this.name+"���ӵ�β��");
			System.out.println("��"+SnakeDemo.this.name+"���ӵ�β��");
		}
	}
	public void show(){
		new Node().addTail();
	}
}

public class Snake
{
	public static void main(String[] args){
		new SnakeDemo().show();
	}
}