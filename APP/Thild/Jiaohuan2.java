public class Jiaohuan2{
	public static void main(String args []){
		int[] a = new int[]{6,9};
		System.out.println("��һ��=" +a[0]+ ",�ڶ�����" +a[1]);
		swap(a,0,1);
		System.out.println("main��һ����" +a[0]+ ",�ڶ�����" +a[1]);
	}
	public static void swap(int[] a,int c, int d){
		int temp =a[c];
		a[c] = a[d];
		a[d] = temp;
		System.out.println("swap��һ����" +a[0]+ ",�ڶ�����" +a[1]);
	}
}