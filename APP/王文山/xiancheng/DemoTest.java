package com.xiancheng;

public class DemoTest {
	static int piao = 50;
	public static void main(String args []){
		
		/*
		//�����߳�
		MyThread myThread = new MyThread();
		//�����߳�
		myThread.start();
		try{
			Thread.sleep(1000);
			System.out.println(System.currentTimeMillis());
		}catch(Exception e){
			e.printStackTrace();
		}
		
		//�����߳�
		MyRunnable myRunnable = new MyRunnable();
		//�����߳�
		new Thread(myRunnable).start();
		
		for(int i = 0;i<10000;i++){
			System.out.println("�������߳�"+i);
		}
		
		*/
		
		
		Chuangkou chuangkou1 = new Chuangkou(piao,"����һ");
		Chuangkou chuangkou2 = new Chuangkou(piao,"���ڶ�");
		Chuangkou chuangkou3 = new Chuangkou(piao,"������");
		
		ChuangkouThread chuangkouThread1 = new ChuangkouThread(chuangkou1);
		ChuangkouThread chuangkouThread2 = new ChuangkouThread(chuangkou2);
		ChuangkouThread chuangkouThread3 = new ChuangkouThread(chuangkou3);
		
		chuangkouThread1.start();
		chuangkouThread2.start();
		chuangkouThread3.start();
		
	}
}
