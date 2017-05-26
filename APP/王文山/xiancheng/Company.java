package com.xiancheng;

public class Company {
	private final static int MAX_SIZE =100;
	private int size=100; 
	
	public Company(int size){
		this.size = size;
	}
	//���
	public void push(int number){
		if (getSize()+number <= MAX_SIZE ){
			System.out.println("������"+number+"��ǰ���Ϊ"+getSize());
			setSize(getSize()+number);
		}else{
			System.out.println("�����������ͣ����");
			try{
				this.wait();//�����ȡ�ö��������̴߳��ڵȴ�״̬
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		notifyAll();
	}
	
	//ȡ��
	public synchronized void pop(int number){
		if(getSize()-number<0){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}else{
			//����
			setSize (getSize()-number);
			System.out.println("����"+number+"���"+getSize());
		}
		notifyAll();
	}
	
	
	private int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	private void setSize(int size) {
		// TODO Auto-generated method stub
		this.size = size;
	}
}
