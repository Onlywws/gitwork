package com.xiancheng;

public class MyRunnable implements Runnable{
	@Override
	public void run(){
		while (true){
			try{
				Thread.sleep(1000);
				System.out.println("�������̶߳�"+System.currentTimeMillis());
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}
}
