package com.xiancheng;

public class ChuangkouThread extends Thread{
	Chuangkou chuangkou;
	//������
	public ChuangkouThread (Chuangkou chuangkou){
		this.chuangkou = chuangkou;
	}
	public void run(){
		chuangkou.sale();
	}
}
