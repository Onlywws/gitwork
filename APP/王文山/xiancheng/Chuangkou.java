package com.xiancheng;

public class Chuangkou {
	private int number;
	private String name;  
	
	public Chuangkou(int number, String name){
		this.number = number;
		this.name = name;
	}
	
	public void sale(){
		while(true){
			if(number<=1){
				System.out.println("������");
				break;
			}
			number--;
			System.out.println(name+"�����˵�"+number+"��Ʊ");
		}
	}
}
