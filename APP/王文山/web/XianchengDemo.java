package com.web;


public class XianchengDemo {
	public static void main (String [] args){	
		//�����߳�
		MyRunnable myRunnable1 = new MyRunnable();
		MyRunnable myRunnable2 = new MyRunnable();
		MyRunnable myRunnable3 = new MyRunnable();
		//�����߳�
		new Thread(myRunnable1).start();
		new Thread(myRunnable2).start();
		new Thread(myRunnable3).start();
	}
}
