public class Zoo2{
	public static void main(String [] args){
		Dog2 erha = new Erha2();
		Dog2 taidi = new Taidi2();
		weigou(taidi);
		weigou(erha);
	}
	public static void weigou(Dog2 dog){
		System.out.println("ˣ��");
		if(dog instanceof Erha2){
			((Erha2)dog).biaoqing();
		}
		if(dog instanceof Taidi2){
			((Taidi2)dog).biaoqing();
		}
		dog.eat();
	}
}