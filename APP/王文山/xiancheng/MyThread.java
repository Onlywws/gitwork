package com.xiancheng;

public class MyThread extends Thread{
	public void run(){
		while (true){
			try{
				Thread.sleep(1000);
				System.out.println("�������߳�һ"+System.currentTimeMillis());
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}
