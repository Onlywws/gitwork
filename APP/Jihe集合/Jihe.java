import java.util.*;
public class Jihe{
	public static void main(String [] args){
		Collection c = new ArrayList();
		c.add("�����");//���Ԫ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		c.remove(6);//ɾ��ָ����Ԫ��
		System.out.println("c���ϵ�Ԫ�ظ���Ϊ��"+c.size());
		System.out.println("c�����Ƿ������������ַ�����"+c.contains("�����"));
		c.add("������J2ee��ҵӦ��ʵս");
		System.out.println("c���ϵ�Ԫ��Ϊ��"+c);
		
		
		Collection books = new HashSet();
		books.add("������J2ee��ҵӦ��ʵս");
		books.add("Struts2Ȩ��ָ��");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�"+c.containsAll(books));
		c.removeAll(books);//c���ϼ�ȥbooks�������Ԫ��
		System.out.println("C���ϵ�Ԫ��"+c);
		c.clear();//ɾ��C�����������Ԫ��
		System.out.println("C���ϵ�Ԫ��"+c);
		books.retainAll(c);
		System.out.println("books���ϵ�Ԫ��"+books);
		

	
	}
}